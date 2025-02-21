package Level_01;

import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);       
        // Declare the number variable to store the input
        int number;       
        // Take input for the number
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();      
        // Check if the number is positive
        if (number > 0) {
            // Calculate the factorial using a for loop
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }        
            // Output the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            // Output if the number is not positive
            System.out.println("The number " + number + " is not a positive integer.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}

