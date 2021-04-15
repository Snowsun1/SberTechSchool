package task3ex1;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        String tempString = "123asdzxcv\n" + "1234sdzxcv\n" + "1235sdzxcv\n" + "123asdzxcv\n" + "123asdzxcv\n" +
                "1236sdzxcv\n" + "1237sdzxcv\n" + "1235sdzxcv\n" + "1235sdzxcv\n" + "1232sdzxcv\n";
        Scanner scanner = new Scanner(tempString);
        HashSet<String> strings = new HashSet<>();
        while (scanner.hasNext()) {
             strings.add(scanner.nextLine());
        }
        System.out.println(strings.size());
    }




}
