
import java.util.Scanner;
// Create a class HarshadNumber it's purpose is to check if a number is a Harshad number or not
class HarshadNumber {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Take user input for the number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      // Create a variable to store the sum of digits
      int sum = 0, originalNumber = number;
      // Use a while loop to find the sum of digits
      while (number != 0) {
         sum += number % 10; // Add the last digit to sum
         number /= 10; // Remove the last digit
      }
      // Check if the number is divisible by the sum of digits
      if (originalNumber%sum == 0) {
         System.out.println(originalNumber + " is a Harshad number.");
      } else {
         System.out.println(originalNumber + " is not a Harshad number.");
      }
   }
}
