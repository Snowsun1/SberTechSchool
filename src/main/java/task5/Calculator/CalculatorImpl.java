package task5.Calculator;

public class CalculatorImpl implements Calculator{
    @Override
    public int calc(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * calc(number - 1);
    }
}
