import java.util.Scanner;

public class SumOfNatural {

    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        int recursiveResult = sumRecursive(n);
        int formulaResult = sumFormula(n);

        System.out.println("Sum using Recursion  : " + recursiveResult);
        System.out.println("Sum using Formula    : " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results are equal. The computation is correct!");
        } else {
            System.out.println("Results do not match. Something is wrong.");
        }
    }
}