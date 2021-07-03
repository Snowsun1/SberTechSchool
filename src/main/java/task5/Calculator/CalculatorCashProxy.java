package task5.Calculator;

import java.util.HashMap;
import java.util.Map;

public class CalculatorCashProxy implements Calculator {
    private final Calculator calculator = new CalculatorImpl();

    private final Map<Integer, Integer> map = new HashMap<>();


    @Override
    public int calc(int number) {
        if (!map.containsKey(number)) {
            map.put(number, calculator.calc(number));
        }
        System.out.println("Результат вычисления факториала " + number + " уже есть в кеше.");
        return map.get(number);
    }

}
