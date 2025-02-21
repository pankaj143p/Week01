package Level_01;
// for use import class
import java.util.Scanner;
class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in); 
        // Declare the number variable to store the user input
        int number;
        // Take input for number
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        // Check if the number is divisible by 5
        boolean isDivisibleByFive = (number % 5 == 0);
      
        // Output the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);
        // Close the scanner stream
        sc.close();
    }
}
