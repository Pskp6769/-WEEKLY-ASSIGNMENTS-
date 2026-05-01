import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First String:\t");
        String str1 = scanner.nextLine();

        System.out.print("Enter Second String:\t");
        String str2 = scanner.nextLine();

        boolean manualResult = compareManual(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("\nManual Result:\t\t" + manualResult);
        System.out.println("Built-in Result:\t" + builtInResult);
        System.out.println("\nVerification:\t\t" + (manualResult == builtInResult) + "\t");

        scanner.close();
    }

    public static boolean compareManual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}