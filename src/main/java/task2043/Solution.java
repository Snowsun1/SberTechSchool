package task2043;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<String> list = Arrays.asList(string.split(">"));
        int h = 0;
        for (String s : list) {
            if (s.contains("/")) {
                h -= 1;
                System.out.println(makeSpace(h) + s + ">");
            } else {
                System.out.println(makeSpace(h) + s + ">");
                h++;
            }

        }
    }

    public static StringBuilder makeSpace(int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count * 2; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }
}
