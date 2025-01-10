package Level_01;

import java.util.Scanner;

class NumberTypeChecker {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare the number variable to store the input number
        int number;
        
        // Take input for number
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        // Check the number's type (positive, negative, or zero)
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}