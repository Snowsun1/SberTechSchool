package task2009;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumber = scanner.nextInt();
        int powOfTwo = 1;
        int sum = 0;
        for (int i = 1; i < countOfNumber + 1; i++) {
            if (i == powOfTwo) {
                sum += scanner.nextInt();
                powOfTwo *= 2;
            } else scanner.nextInt();
        }
        System.out.println(sum);
    }
}
