import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];


        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Analysis ---");


        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is: ");

            if (num > 0) {

                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }


        System.out.println("\n--- Comparison ---");
        int first = numbers[0];
        int last = numbers[4];

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to the last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than the last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than the last element (" + last + ").");
        }

        scanner.close();
    }
}