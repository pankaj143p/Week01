import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);       
        // Declare the number variable to store the user input
        int number;      
        // Take input from the user
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();      
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the input number
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    // If not divisible by 3 or 5, print the number itself
                    System.out.println(i);
                }
            }
        }

        // Close the scanner stream
        sc.close();
    }
}