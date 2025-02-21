    
import java.util.Scanner;
class LeapYearSingleIf {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);        
        // Declare the variable to store the input year
        int year;      
        // Take year as input
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        
        // Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582) {
            // Single if condition using logical operators
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year should be greater than or equal to 1582 as per the Gregorian calendar.");
        }
        
        // Close the scanner object
        sc.close();
    }
}