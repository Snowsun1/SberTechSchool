package task5.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CashInvocationHandler implements InvocationHandler {
    Object delegate;
    public CashInvocationHandler (Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!method.isAnnotationPresent(Cash.class)) {
            return method.invoke(delegate, args);
        }
        System.out.println("Вызван метод calc");
        return method.invoke(delegate, args);
    }
}
