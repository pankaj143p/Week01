package Level_01;

import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare the month and day variables
        int month, day;
        
        // Take input for month and day
        System.out.print("Enter the month number: ");
        month = sc.nextInt();
        System.out.print("Enter the day number: ");
        day = sc.nextInt();
        
        // Check if the given date falls within the spring season (March 20 to June 20)
        boolean isSpringSeason = (month > 3 && month < 6) || (month == 3 && day >= 20) || (month == 6 && day <= 20);
        
        // Output the result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}