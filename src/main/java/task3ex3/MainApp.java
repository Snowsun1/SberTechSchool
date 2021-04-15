package task3ex3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String tempString = "Rostov\n" + "Rostov\n" + "Moscow\n" + "StPeter\n" + "Riga\n" +
                "Riga\n" + "Rostov\n" + "Moscow\n" + "Riga\n" + "Luga\n";
        Scanner scanner = new Scanner(tempString);
        ArrayList<String> strings = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            strings.add(scanner.nextLine());
        }
        for (String string : strings) {
            if (hashMap.containsKey(string)) {
                hashMap.put(string, hashMap.get(string) + 1);
            }
            else {
                hashMap.put(string, 1);
            }
        }

        System.out.println(hashMap);

    }
}
