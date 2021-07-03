package task5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainApp {
    public static void main(String[] args) {
        Method [] methods = MyObject.class.getMethods();
        Class myObjectClass = MyObject.class;
        Field[] fields = myObjectClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }
    }
}
