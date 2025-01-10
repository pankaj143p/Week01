package Level_03;
import java.util.Scanner;
// create a class ArmstrongNumber it's purpose is to check if a number is an Armstrong number or not
class ArmstrongNumber {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);

      // Take user input for the number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      // Create variables to store sum and original number
      int sum=0, originalNumber=number;
      // Use while loop to iterate through each digit of the number
      while (number!=0){
         int digit=number%10; // Get the last digit
         sum+=Math.pow(digit, 3); // Add the cube of the digit to sum
         number/=10; // Remove the last digit
      }

      // Check if the sum equals the original number
      if (sum==originalNumber) {
         System.out.println(originalNumber + " is an Armstrong number.");
      } else {
         System.out.println(originalNumber + " is not an Armstrong number.");
      }
   }
}
