package task3ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String tempString = "Rostov\n" + "Rostov\n" + "Moscow\n" + "StPeter\n" + "Riga\n" +
                "Riga\n" + "Rostov\n" + "Moscow\n" + "Riga\n" + "Luga\n";
        Scanner scanner = new Scanner(tempString);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            strings.add(scanner.nextLine());
        }
        scanner.close();
        scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int count = scanner.nextInt();
        System.out.println("Введите номера строк");
        for(int i = 0; i < count; i++) {
            System.out.println(strings.get(scanner.nextInt()));
        }


    }

}
