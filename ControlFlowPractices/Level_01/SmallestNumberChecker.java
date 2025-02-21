package Level_01;

import java.util.Scanner;
class SmallestNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare three variables for input numbers
        int number1, number2, number3;
        // Take inputs for the three numbers
        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        number3 = sc.nextInt();
        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2 && number1 < number3);
        
        // Output the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        
        // Close the scanner stream
        sc.close();
    }
}