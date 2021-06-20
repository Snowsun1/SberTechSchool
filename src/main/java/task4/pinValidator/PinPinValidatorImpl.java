package task4.pinValidator;

import task4.pinValidatorExceptions.NotNumberException;
import task4.pinValidatorExceptions.NotOneNumberException;

import java.util.Scanner;

public class PinPinValidatorImpl implements PinValidator {

    @Override
    public boolean checkSymbol(String string) throws NotNumberException, NotOneNumberException {
        if (string.toCharArray().length > 1) {
            throw new NotOneNumberException(string + " больше одного симбвола");
        }
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            throw new NotNumberException(string + " не является числом");
        }

    }

    @Override
    public String checkPin(Scanner scanner) {
        boolean bool;
        StringBuilder PIN = new StringBuilder();
        System.out.println("Введите PIN");
        while (PIN.length() != 4) {
            String string = scanner.nextLine();
            try {
                bool = checkSymbol(string);
            } catch (NotNumberException | NotOneNumberException e) {
                System.out.println(e.getMessage());
                bool = false;
            }
            if (bool) {
                PIN.append(string);
            }
        }
        return PIN.toString();
    }

}
