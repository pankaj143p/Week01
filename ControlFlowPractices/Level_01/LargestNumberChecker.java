package Level_01;

import java.util.Scanner;

class LargestNumberChecker {
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
        
        // Check which number is the largest
        boolean isFirstLargest = (number1 > number2 && number1 > number3);
        boolean isSecondLargest = (number2 > number1 && number2 > number3);
        boolean isThirdLargest = (number3 > number1 && number3 > number2);
        
        // Output the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        // Close the scanner stream
        sc.close();
    }
}
