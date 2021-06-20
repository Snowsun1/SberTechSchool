package task4.terminalServer;

import task4.treminaServerExceptions.NotEnoughMoney;
import task4.treminaServerExceptions.NotMultiplicity100Exception;

public interface TerminalServer {
    boolean checkPin(String string);

    String showBalance();

    void putMoney(String string) throws NotMultiplicity100Exception;

    void getMoney(String string) throws NotEnoughMoney, NotMultiplicity100Exception;
}
