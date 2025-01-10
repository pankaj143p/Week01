package Level_01;
import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare total variable to store the sum
        double total = 0.0;
        double number;
        
        // Start the loop to get user input until 0 is entered
        System.out.println("Enter numbers to sum. Enter 0 to stop:");
        
        // Using while loop to continue adding numbers until 0 is entered
        while (true) {
            number = sc.nextDouble();
            
            if (number == 0) {
                break; // Exit the loop if 0 is entered
            }
            
            total += number; // Add entered number to the total
        }
        
        // Output the total sum
        System.out.println("The total sum of entered numbers is: " + total);
        
        // Close the scanner stream
        sc.close();
    }
}