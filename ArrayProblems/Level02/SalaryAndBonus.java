import java.util.Scanner;

class EmployeeBonus {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

      // Declare arrays to store salary, years of service, bonus, and new salary
      double[] salaries = new double[10];
      int[] yearsOfService = new int[10];
      double[] bonus = new double[10];
      double[] newSalaries = new double[10];

      // Declare variables for total bonus, total old salary, and total new salary
      double totalBonus = 0;
      double totalOldSalary = 0;
      double totalNewSalary = 0;

      // Input the salary and years of service for 10 employees
      for (int i = 0; i < 10; i++) {
         while (true) {
            try {
               System.out.print("Enter the salary for employee " + (i + 1) + ": ");
               salaries[i] = sc.nextDouble();

               System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
               yearsOfService[i] = sc.nextInt();

               // Validate input: salary should be positive, years of service should be non-negative
               if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                  System.out.println("Invalid input! Salary should be greater than 0 and years of service should be non-negative.");
                  continue; // Re-prompt the user for valid input
               }
               break; // If input is valid, exit the loop
            } catch (Exception e) {
               System.out.println("Invalid input! Please enter valid numbers.");
               sc.next(); // Clear the invalid input
            }
         }
      }

      // Calculate the bonus, new salary, and accumulate totals
      for (int i = 0; i < 10; i++) {
         // Determine bonus based on years of service
         if (yearsOfService[i] > 5) {
            bonus[i] = 0.05 * salaries[i]; // 5% bonus for more than 5 years of service
         } else {
            bonus[i] = 0.02 * salaries[i]; // 2% bonus for less than or equal to 5 years of service
         }

         // Calculate the new salary by adding the bonus to the original salary
         newSalaries[i] = salaries[i] + bonus[i];

         // Accumulate total bonus, total old salary, and total new salary
         totalBonus += bonus[i];
         totalOldSalary += salaries[i];
         totalNewSalary += newSalaries[i];
      }

      // Display the total bonus payout, total old salary, and total new salary
      System.out.println("\nTotal bonus payout for all employees: " + totalBonus);
      System.out.println("Total old salary of all employees: " + totalOldSalary);
      System.out.println("Total new salary of all employees: " + totalNewSalary);

      // Close the Scanner Object
      sc.close();
   }
}