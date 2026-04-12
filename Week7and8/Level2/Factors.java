import java.util.Scanner;

public class Factors {

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int f : factors) {
            sumOfSquares += Math.pow(f, 2);
        }
        return sumOfSquares;
    }

    static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid positive number.");
            return;
        }

        int[] factors = findFactors(n);

        System.out.print("Factors of " + n + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println();
        System.out.println("Sum of factors            : " + findSum(factors));
        System.out.println("Sum of squares of factors : " + (long)findSumOfSquares(factors));
        System.out.println("Product of factors        : " + findProduct(factors));
    }
}