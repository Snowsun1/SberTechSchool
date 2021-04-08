package task2013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenArr = scanner.nextInt();
        ArrayList<Integer> arrayList = toArr(lenArr, scanner);
        int minOfList = Collections.min(arrayList);
        long countOfMin = arrayList.stream()
                .filter(i -> i == minOfList)
                .count();

        System.out.println(countOfMin);
    }


    public static ArrayList<Integer> toArr(int lenArr, Scanner scanner) {
        ArrayList<Integer> arrayList = new ArrayList<>(lenArr);
        for (int i = 0; i < lenArr; i++) {
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }

}
