
import java.util.Scanner;
// create a class CountDigits it's purpose is to count the number of digits in a number
class CountDigits {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Take user input for the number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      // Create a variable to count the digits
      int count=0;
      // Use a loop to count the digits
      while (number!=0) {
         // Remove the last digit
         number/=10; 
         // Increment count for each digit
         count++; 
      }
      // Display the count of digits
      System.out.println("The number of digits is: " + count);
   }
}
