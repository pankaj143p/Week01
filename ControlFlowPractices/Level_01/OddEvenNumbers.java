package Level_01;

import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        // Declare the number variable to store the upper limit
        int number;    
        // Take input for the number
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            // Iterate and print odd and even numbers between 1 and number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        } else {
            // Output if the number is not positive
            System.out.println("The number " + number + " is not a positive integer.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}
