package task2Class;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        Person a = new Person(false, "Витя");
        Person b = new Person(true, "Кристина");
        Person c = new Person(false, "Виталя");
        Person d = new Person(true, "Оля");

        a.marry(b);
        c.marry(d);
        a.marry(d);
        a.print();
        b.print();
        c.print();
        d.print();

    }
}
