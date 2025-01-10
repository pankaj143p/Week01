package Level_03;
import java.util.Scanner;
// Create a class Calculator it's purpose is to perform basic arithmetic operations
class Calculator {
   public static void main(String[] args) {

      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);

      // Get inputs for the first number, second number, and the operator
      System.out.print("Enter first number: ");
      // Read the first number as a double
      double first = sc.nextDouble();
      System.out.print("Enter second number: ");
      // Read the second number as a double
      double second = sc.nextDouble();
      System.out.print("Enter operator (+, -, *, /): ");
      // Read the operator as a char
      char op = sc.next().charAt(0); 

      // Perform operations based on the input operator using if-else
      double result;

      if (op == '+') {
         result = first + second;
      } else if (op == '-') {
         result = first - second;
      } else if (op == '*') {
         result = first * second;
      } else if (op == '/') {
         if (second != 0) {
            result = first / second;
         } else {
            System.out.println("Error: Division by zero.");
            return;
         }
      } else {
         System.out.println("Invalid Operator.");
         return;
      }

      // Print the result of the operation
      System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
   }
}
