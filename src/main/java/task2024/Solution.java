package task2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenArr = scanner.nextInt();
        ArrayList<Integer> arrayList = toArr(lenArr, scanner);
        int countHaveToChange = 0;
        for (int i = 0; i < lenArr / 2; i++) {
            if (!(arrayList.get(i).equals(arrayList.get(lenArr - i - 1)))) {
                countHaveToChange++;
            }
        }
        System.out.println(countHaveToChange);

    }

    public static ArrayList<Integer> toArr(int lenArr, Scanner scanner) {
        ArrayList<Integer> arrayList = new ArrayList<>(lenArr);
        for (int i = 0; i < lenArr; i++) {
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }


}


