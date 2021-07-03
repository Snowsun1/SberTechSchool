package task5.Calculator;

import java.lang.reflect.Proxy;

public class MainDynamic {
    public static void main(String[] args) {
        Calculator delegates = new CalculatorCashProxy();
        Calculator calculator = (Calculator) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                delegates.getClass().getInterfaces(),
                new CashInvocationHandler(delegates));
        System.out.println(calculator.calc(3));
        System.out.println(calculator.calc(3));
        System.out.println(calculator.calc(3));
        calculator.calc(5);
    }


    public static void run (Calculator calculator) {
        System.out.println(calculator.calc(5));
    }
}
