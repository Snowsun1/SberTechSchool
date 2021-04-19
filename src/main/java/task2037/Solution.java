package task2037;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        List<String> list = Arrays.asList(string.split(",", -1));
        int k = scanner.nextInt();
        String filteredList = list.stream()
                .filter(str -> k <= str.length())
                .collect(Collectors.joining(","));




    }
}
