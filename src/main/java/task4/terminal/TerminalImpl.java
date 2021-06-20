package task4.terminal;

import task4.pinValidator.PinPinValidatorImpl;
import task4.pinValidator.PinValidator;
import task4.termialExceptions.BlockAccessException;
import task4.terminalServer.TerminalServer;
import task4.terminalServer.TerminalServerImpl;
import task4.treminaServerExceptions.NotEnoughMoney;
import task4.treminaServerExceptions.NotMultiplicity100Exception;

import java.util.Date;
import java.util.Scanner;

public class TerminalImpl implements Terminal {
    int timeBlock = 10000;
    private boolean isLocked = false;
    private boolean haveAccess = false;
    private final TerminalServer terminalServer = new TerminalServerImpl();
    private final PinValidator validator = new PinPinValidatorImpl();
    private long date;


    private boolean checkPin(Scanner scanner) throws BlockAccessException {
        if (ifUserIsBlocked() && (!isLocked)) {
            int countOfTry = 0;
            while (countOfTry != 3 && !isLocked) {
                if (terminalServer.checkPin(validator.checkPin(scanner))) {
                    System.out.println("Вы ввели правильный PIN");
                    haveAccess = true;
                    return true;
                } else {
                    System.out.println("Вы ввели неправильный PIN");
                    countOfTry++;
                }
            }
            if (countOfTry == 3) {
                isLocked = true;
                Date blockDate = new Date();
                date = blockDate.getTime();
                throw new BlockAccessException("Вы 3 раза ввели непривильный PIN подождите 10 секнунд");
            }
        }
        return false;
    }

    @Override
    public void getAccess(Scanner scanner) {
        try {
            checkPin(scanner);
        } catch (BlockAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean ifUserIsBlocked() {
        Date dateNow = new Date();
        long time = dateNow.getTime();
        if (time >= date + timeBlock) {
            isLocked = false;
            return true;
        } else {
            System.out.println("Вы заблокированы, подождите " + (10 - (time - date) / 1000));
        }
        return false;
    }

    @Override
    public void showBalance() {
        if (ifUserIsBlocked()) {
            if (haveAccess) {
                System.out.println(terminalServer.showBalance());
            } else {
                System.out.println("Вы ещё не ввели PIN");
            }
        }
    }

    @Override
    public void getMoney(Scanner scanner) {
        if (ifUserIsBlocked()) {
            if (haveAccess) {
                try {
                    System.out.println("Введите сумму которую хотите снять со счётета кратную 100");
                    String string = scanner.nextLine();
                    terminalServer.getMoney(string);
                    System.out.println("Выдача " + string + " $");
                } catch (NotEnoughMoney | NotMultiplicity100Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Вы ещё не ввели PIN");
            }
        }
    }

    @Override
    public void putMoney(Scanner scanner) {
        if (ifUserIsBlocked()) {
            if (haveAccess) {
                try {
                    System.out.println("Введите сумму которую хотите внести на счёт, кратную 100");
                    String string = scanner.nextLine();
                    terminalServer.putMoney(string);
                    System.out.println("Внесено " + string + " $");
                } catch (NotMultiplicity100Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("Вы ещё не ввели PIN");
        }
    }
}
