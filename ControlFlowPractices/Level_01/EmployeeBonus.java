package Level_01;
import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);        
        // Declare salary and years of service variables
        double salary;
        int yearsOfService;
        // Take input for salary and years of service
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        yearsOfService = sc.nextInt();
        
        // Calculate bonus based on years of service
        double bonus = (yearsOfService > 5) ? (salary * 0.05) : 0;
        
        // Output the bonus amount
        System.out.println("The employee's bonus is: " + bonus);
        
        // Close the scanner stream
        sc.close();
    }
}