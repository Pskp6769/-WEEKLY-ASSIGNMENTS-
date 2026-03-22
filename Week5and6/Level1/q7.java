import java.util.Scanner;

public class q7{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double [11];
        double sum = 0;
        System.out.println("enter the height of the 11 football players :");
        for (int i = 0;i < heights.length; i++) {
            System.out.print("Player" + (i + 1) + ":");
            heights[1] = scanner.nextDouble();
            sum = sum + heights[i];
        }
            double meanHeight = sum/11;

            System.out.printf("\nthe mean height of the players is : %.2f\n ", meanHeight);
            scanner.close();


    }
}