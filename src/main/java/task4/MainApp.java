package task4;

import task4.pinValidatorExceptions.NotNumberException;
import task4.termialExceptions.BlockAccessException;
import task4.terminal.Terminal;
import task4.terminal.TerminalImpl;
import task4.treminaServerExceptions.NotEnoughMoney;
import task4.treminaServerExceptions.NotMultiplicity100Exception;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws NotNumberException, BlockAccessException, NotMultiplicity100Exception, NotEnoughMoney {
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new TerminalImpl();
        String[] strings = {"Что бы ввести пин нажмите 1 ", "Что бы проверить баланс нажмите 2",
                "Что бы положить деньги на счёт нажмите 3", "Что бы снять деньги со счёта нажмите 4",
                "Что бы выйти нажмите 5"};

        boolean flag = true;
        System.out.println("Здравствуйте, что бы продолжить выберете один из пунктов меню!" + System.lineSeparator());
        while (flag) {
            for (String string : strings) {
                System.out.println(string);
            }
            switch (scanner.nextLine()) {
                case "1" -> terminal.getAccess(scanner);
                case "2" -> terminal.showBalance();
                case "3" -> terminal.putMoney(scanner);
                case "4" -> terminal.getMoney(scanner);
                case "5" -> {
                    System.out.println("Всего доброго");
                    flag = false;
                }
            }
        }

    }
}
