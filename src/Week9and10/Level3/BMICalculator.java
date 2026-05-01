import java.util.Scanner;

public class BMICalculator {

    static String[] findBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiData = findBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    static void displayResult(String[][] result) {
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------------");
        for (String[] row : result) {
            System.out.printf("%-15s %-15s %-15s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("  Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("  Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = computeBMI(data);
        System.out.println();
        displayResult(result);
    }
}