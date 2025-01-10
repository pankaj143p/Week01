package Level_03;
import java.util.Scanner;
// create a class AbundantNumber it's purpose is to check if a number is an Abundant number or not
class AbundantNumber {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Take user input for the number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      // Create a variable to store the sum of divisors
      int sum = 0;
      // Find the divisors and add them to sum
      for (int i=1;i<number; i++) {
         if (number%i==0) { // If i is a divisor
            sum=sum+i;
         }
      }
      // Check if the sum of divisors is greater than the number
      if (sum > number) {
         System.out.println(number + " is an Abundant number.");
      } else {
         System.out.println(number + " is not an Abundant number.");
      }
   }
}
