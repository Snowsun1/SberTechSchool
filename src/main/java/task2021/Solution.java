package task2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenArr = scanner.nextInt();
        ArrayList<Integer> arrayList = toArr(lenArr, scanner);
        for (int i = 0; i < 2; i++) {
            int maxOfArray = Collections.max(arrayList);
            while (arrayList.contains(maxOfArray)) {
                arrayList.set(arrayList.indexOf(maxOfArray), maxOfArray / 2);
            }
        }

        for (int i = 0; i < lenArr; i++) {
            System.out.println(arrayList.get(i));
        }

    }

    public static ArrayList<Integer> toArr(int lenArr, Scanner scanner) {
        ArrayList<Integer> arrayList = new ArrayList<>(lenArr);
        for (int i = 0; i < lenArr; i++) {
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }


}