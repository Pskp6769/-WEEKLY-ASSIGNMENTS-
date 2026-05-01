public class NullPointerDemo {

    static void generateException() {
        String text = null;
        System.out.println("Calling length() on null string...");
        System.out.println(text.length());
    }

    static void demonstrateNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Generating Exception (no handler) ---");
        generateException();

        System.out.println("\n--- Demonstrating NullPointerException (with handler) ---");
        demonstrateNullPointer();
    }
}