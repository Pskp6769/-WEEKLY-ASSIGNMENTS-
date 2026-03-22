import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] ages = new int[10];

        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");


        for (int i = 0; i < ages.length; i++) {
            int currentAge = ages[i];


            if (currentAge < 0) {
                System.out.println("Age " + currentAge + " is an invalid age.");
            }

            else if (currentAge >= 18) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            }

            else {
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }

        scanner.close();
    }
}