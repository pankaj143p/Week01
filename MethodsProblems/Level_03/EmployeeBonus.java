import java.util.Random;
public class EmployeeBonus {
        // Method to generate random salary and years of service for each employee
        public static double[][] generateEmployeeData(int numEmployees) {
            Random rand = new Random();
            double[][] employeeData = new double[numEmployees][2];
            for (int i = 0; i < numEmployees; i++) {
                double salary = 10000 + (rand.nextInt(90000));  // Generate salary between 10000 and 99999
                int yearsOfService = rand.nextInt(20) + 1;  // Generate years of service between 1 and 20
                employeeData[i][0] = salary;  // Store salary
                employeeData[i][1] = yearsOfService;  // Store years of service
            }
            return employeeData;
        }
    
        // Method to calculate bonus and new salary based on years of service
        public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
            double[][] updatedData = new double[employeeData.length][3];
            for (int i = 0; i < employeeData.length; i++) {
                double oldSalary = employeeData[i][0];
                int yearsOfService = (int) employeeData[i][1];
                double bonus = 0;
    
                // Determine bonus based on years of service
                if (yearsOfService > 5) {
                    bonus = oldSalary * 0.05;  // 5% bonus for service more than 5 years
                } else {
                    bonus = oldSalary * 0.02;  // 2% bonus for service 5 years or less
                }
    
                // Calculate new salary by adding the bonus
                double newSalary = oldSalary + bonus;
    
                // Store old salary, bonus, and new salary
                updatedData[i][0] = oldSalary;
                updatedData[i][1] = bonus;
                updatedData[i][2] = newSalary;
            }
            return updatedData;
        }
    
        // Method to calculate and display totals in tabular format
        public static void calculateAndDisplayTotals(double[][] updatedData) {
            double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
    
            // Display header for tabular format
            System.out.println("---------------------------------------------------------");
            System.out.println("Emp ID | Old Salary | Bonus Amount | New Salary");
            System.out.println("---------------------------------------------------------");
    
            // Display employee data and calculate totals
            for (int i = 0; i < updatedData.length; i++) {
                double oldSalary = updatedData[i][0];
                double bonus = updatedData[i][1];
                double newSalary = updatedData[i][2];
    
                totalOldSalary += oldSalary;
                totalNewSalary += newSalary;
                totalBonus += bonus;
    
                // Display employee data in tabular format
                System.out.printf("%6d | %.2f      | %.2f        | %.2f\n", i + 1, oldSalary, bonus, newSalary);
            }
    
            // Display totals
            System.out.println("---------------------------------------------------------");
            System.out.printf("Total   | %.2f      | %.2f        | %.2f\n", totalOldSalary, totalBonus, totalNewSalary);
            System.out.println("---------------------------------------------------------");
        }
    
        public static void main(String[] args) {
            // Check if command-line arguments are provided
            int numEmployees = 10;  // Default number of employees
    
            // If an argument is passed, try to parse the number of employees
            if (args.length > 0) {
                try {
                    numEmployees = Integer.parseInt(args[0]);  // Read number of employees from command line argument
                } catch (NumberFormatException e) {
                    // If the argument is not a valid number, print an error and use the default value
                    System.out.println("Invalid number of employees. Using default value of 10.");
                }
            }
    
            // Generate employee data, calculate bonuses and new salaries, then display totals
            double[][] employeeData = generateEmployeeData(numEmployees);
            double[][] updatedData = calculateBonusAndNewSalary(employeeData);
            calculateAndDisplayTotals(updatedData);
        }
    }
    