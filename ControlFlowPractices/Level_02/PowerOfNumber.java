import java.util.Scanner;
class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables to store number and power
        int number, power;
        
        // Take inputs for number and power
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter the power: ");
        power = sc.nextInt();
        
        // Initialize result to 1
        int result = 1;
        
        // Run a for loop to compute the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number in each iteration
        }
        
        // Output the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
        
        // Close the scanner stream
        sc.close();
    }
}