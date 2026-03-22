import java.util.Scanner;

public class Q3L2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a minimum double digit integer: ");
        long number = scanner.nextLong();


        int maxDigit = 10;
        int[] digitsArray = new int[maxDigit];
        int index = 0;


        while (number != 0 && index < maxDigit) {

            int lastDigit = (int) (number % 10);
            digitsArray[index] = lastDigit;


            number = number / 10;
            index++;
        }


        int largest = 0;
        int secondLargest = 0;


        for (int i = 0; i < index; i++) {
            int current = digitsArray[i];

            if (current > largest) {

                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current < largest) {

                secondLargest = current;
            }
        }


        System.out.println("\n--- Results ---");
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}