import java.util.Random;

public class FootballTeamHeight {

    static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }
        return shortest;
    }

    static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];

        System.out.println("Heights of all 11 players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
            System.out.println("Player " + (i + 1) + " : " + heights[i] + " cms");
        }

        System.out.println();
        System.out.println("Shortest height : " + findShortest(heights) + " cms");
        System.out.println("Tallest height  : " + findTallest(heights) + " cms");
        System.out.printf("Mean height     : %.2f cms%n", findMean(heights));
    }
}