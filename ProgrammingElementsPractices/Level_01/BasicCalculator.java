import java.util.Scanner;
// Create a class BasicCalculator
class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        // Declare variables for two numbers
        double num1, num2;
        // Take input for two numbers
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();
        // Perform arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        // Output the results
        System.out.println("The addition, subtraction, multiplication, and division value of " + num1 + " and " + num2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        sc.close();
    }
}
 