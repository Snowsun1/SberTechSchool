package task3ex2;

import java.util.*;
import java.util.stream.Collectors;


public class MainApp {
    public static void main(String[] args) {
        String tempString = "123asdzxcv\n" + "1234sdzxcv\n" + "1235sdzxcv\n" + "123asdzxc\n" + "123asdzx\n" +
                "1236sdzxcv\n" + "1237sdzxcv\n" + "1235sdzxc\n" + "1235sdzx\n" + "1232sdzxcv\n";
        Scanner scanner = new Scanner(tempString);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            strings.add(scanner.nextLine());
        }
        strings.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println(strings);

    }


}