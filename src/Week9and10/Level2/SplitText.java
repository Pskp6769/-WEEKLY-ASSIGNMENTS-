import java.util.Scanner;

public class SplitText {

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

    static String[] customSplit(String str) {
        int len = findLength(str);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int spaceCount = 1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceCount] = i;
                spaceCount++;
            }
        }
        spaceIndexes[wordCount] = len;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = str.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
        }

        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (findLength(String.join("", arr1)) != findLength(String.join("", arr2))) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] customWords = customSplit(str);
        String[] builtInWords = str.split(" ");

        System.out.println("\nWords using custom method:");
        for (String w : customWords) {
            System.out.println(w);
        }

        System.out.println("\nWords using split() method:");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        boolean match = compareArrays(customWords, builtInWords);
        System.out.println("\nBoth results match: " + match);
    }
}
