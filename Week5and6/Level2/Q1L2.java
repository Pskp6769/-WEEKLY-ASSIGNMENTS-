import java.util.Scanner;

public class Q1L2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 10;


        double[] oldSalaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;


        System.out.println("Enter details for " + numEmployees + " employees:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            double salaryInput = scanner.nextDouble();
            System.out.print("Enter Years of Service: ");
            double serviceInput = scanner.nextDouble();


            if (salaryInput < 0 || serviceInput < 0) {
                System.out.println("Invalid input! Salary and service cannot be negative. Please re-enter.");
                i--;
            } else {
                oldSalaries[i] = salaryInput;
                yearsOfService[i] = serviceInput;
            }
        }


        for (int i = 0; i < numEmployees; i++) {
            double rate = (yearsOfService[i] > 5) ? 0.05 : 0.02; // a. 5% if > 5yrs, else 2%

            bonuses[i] = oldSalaries[i] * rate;
            newSalaries[i] = oldSalaries[i] + bonuses[i];


            totalOldSalary += oldSalaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }


        System.out.println("\n--- Zara Company Payroll Summary ---");
        System.out.printf("Total Old Salary Payout: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout:     %.2f\n", totalBonus);
        System.out.printf("Total New Salary Payout: %.2f\n", totalNewSalary);

        scanner.close();
    }
}