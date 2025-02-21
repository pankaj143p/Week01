package Level_01;

import java.util.Scanner;

class FactorialWhile {
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
            // Calculate the factorial using a while loop
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
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

