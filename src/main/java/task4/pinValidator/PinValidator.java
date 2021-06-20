package task4.pinValidator;

import task4.pinValidatorExceptions.NotNumberException;
import task4.pinValidatorExceptions.NotOneNumberException;

import java.util.Scanner;

public interface PinValidator {

    boolean checkSymbol(String string) throws NotNumberException, NotOneNumberException;

    String checkPin(Scanner scanner);

}
