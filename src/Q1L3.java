import java.util.Scanner;

public class Q1L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long tempNumber = number;


        int count = 0;
        if (tempNumber == 0) count = 1;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }


        int[] digitsArray = new int[count];
        tempNumber = number;
        for (int i = count - 1; i >= 0; i--) {
            digitsArray[i] = (int) (Math.abs(tempNumber) % 10);
            tempNumber /= 10;
        }


        int[] frequency = new int[10];
        for (int digit : digitsArray) {
            frequency[digit]++;
        }


        System.out.println("\nDigit Frequency for " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}
