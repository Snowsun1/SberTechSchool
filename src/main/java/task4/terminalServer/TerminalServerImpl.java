package task4.terminalServer;

import task4.treminaServerExceptions.NotEnoughMoney;
import task4.treminaServerExceptions.NotMultiplicity100Exception;


public class TerminalServerImpl implements TerminalServer {
    private int balance = 1000;

    @Override
    public boolean checkPin(String string) {
        String pin = "1234";
        return pin.equals(string);
    }

    @Override
    public String showBalance() {
        return balance + "$";
    }

    @Override
    public void putMoney(String string) throws NotMultiplicity100Exception {
        if (Integer.parseInt(string) % 100 != 0) {
            throw new NotMultiplicity100Exception("Сумма не кратна 100, пожалуйста внесите сумму кратную 100");
        } else {
            balance += Integer.parseInt(string);
        }
    }

    @Override
    public void getMoney(String string) throws NotEnoughMoney, NotMultiplicity100Exception {
        if (Integer.parseInt(string) % 100 != 0) {
            throw new NotMultiplicity100Exception("Сумма не кратна 100, пожалуйста внесите сумму кратную 100");
        }
        if (Integer.parseInt(string) > balance) {
            throw new NotEnoughMoney("Недостаточно средств на счету");
        } else {
            balance -= Integer.parseInt(string);
        }
    }
}
