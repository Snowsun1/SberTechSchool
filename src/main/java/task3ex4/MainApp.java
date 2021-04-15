package task3ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String tempString = "Rostov\n" + "Rostov\n" + "Moscow\n" + "StPeter\n" + "Riga\n" +
                "Riga\n" + "Rostov\n" + "Moscow\n" + "Riga\n" + "Luga\n";
        Scanner scanner = new Scanner(tempString);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            strings.add(reverseString(scanner.nextLine()));
        }

        System.out.println(strings);

    }


    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
