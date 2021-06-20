package task4.terminal;

import task4.termialExceptions.BlockAccessException;
import task4.treminaServerExceptions.NotEnoughMoney;
import task4.treminaServerExceptions.NotMultiplicity100Exception;

import java.util.Scanner;

public interface Terminal {
    void getAccess(Scanner scanner) throws BlockAccessException;
    void showBalance();
    boolean ifUserIsBlocked();
    void getMoney(Scanner scanner) throws NotEnoughMoney;
    void putMoney(Scanner scanner) throws NotMultiplicity100Exception;
}
