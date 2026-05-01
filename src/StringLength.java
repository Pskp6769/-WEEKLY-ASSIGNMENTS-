import java.util.Scanner;

public class StringLength {

    static int findLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        int customLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using custom method  : " + customLength);
        System.out.println("Length using length() method: " + builtInLength);
    }
}