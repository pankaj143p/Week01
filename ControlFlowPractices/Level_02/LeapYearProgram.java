import java.util.Scanner;
class LeapYearProgram {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);       
        // Declare the variable to store the input year
        int year;       
        // Take year as input
        System.out.print("Enter a year: ");
        year = sc.nextInt();      
        // Check if the year is valid (greater than or equal to 1582)
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582 as per the Gregorian calendar.");
        } else {
            // Check if the year is divisible by 400
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } 
            // Check if the year is divisible by 100 but not 400
            else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            }
            // Check if the year is divisible by 4 but not 100
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
            // If none of the conditions are met, it's not a Leap Year
            else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        
        // Close the scanner object
        sc.close();
    }
}