import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String str) {
        System.out.println("Calling substring with start index greater than end index...");
        String result = str.substring(5, 2);
        System.out.println(result);
    }

    static void demonstrateIllegalArgument(String str) {
        try {
            String result = str.substring(5, 2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        System.out.println("\n--- Generating Exception (no handler) ---");
        generateException(str);

        System.out.println("\n--- Demonstrating IllegalArgumentException (with handler) ---");
        demonstrateIllegalArgument(str);
    }
}