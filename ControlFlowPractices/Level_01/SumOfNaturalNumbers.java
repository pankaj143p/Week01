package Level_01;

import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare the number variable to store the input number
        int number;
        
        // Take input for number
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            // Calculate the sum of first 'number' natural numbers
            int sum = number * (number + 1) / 2;
            // Output the result
            System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        } else {
            // Output if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Close the scanner stream
        sc.close();
    }
}
