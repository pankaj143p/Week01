package Level_01;
import java.util.Scanner;
class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare the number variable to store the input
        int number;
        
        // Take input for number
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();
        
        // Check if the number is a positive integer
        if (number > 0) {
            // Calculate the sum using the formula n*(n+1)/2
            int sumUsingFormula = number * (number + 1) / 2;
            
            // Calculate the sum using while loop
            int sumUsingWhile = 0;
            int i = 1;
            while (i <= number) {
                sumUsingWhile += i;
                i++;
            }
            
            // Compare the two results and output
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingWhile);
            
            // Check if both results are the same
            if (sumUsingFormula == sumUsingWhile) {
                System.out.println("Both calculations match.");
            } else {
                System.out.println("There is a discrepancy between the calculations.");
            }
        } else {
            // Output if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}