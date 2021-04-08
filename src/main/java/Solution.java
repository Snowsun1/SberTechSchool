import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumber = scanner.nextInt();
        int maxRepeats = 0;
        int maxRepeatNumber = 0;
        int tempRepeats = 1;
        int tempNumber = scanner.nextInt();
        int currentNumber = 0;
        for (int i = 0; i < countOfNumber - 1; i++) {

            currentNumber = scanner.nextInt();

            if (tempNumber == currentNumber) {
                tempRepeats += 1;
            }
            if (tempRepeats > maxRepeats && tempNumber != currentNumber) {
                maxRepeatNumber = tempNumber;
                maxRepeats = tempRepeats;
                tempRepeats = 1;
            } else if (tempNumber != currentNumber) {
                tempRepeats = 1;
            }

            tempNumber = currentNumber;


        }
        if (tempRepeats > maxRepeats) {
            maxRepeatNumber = tempNumber;
            maxRepeats = tempRepeats;
        }
        System.out.println(maxRepeatNumber + " " + maxRepeats);


    }
}
