import java.util.Scanner;
class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variable to store number
        int number;
        
        // Take input for number
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        
        // Run a for loop to find the factors of number
        System.out.print("The factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // If i is a factor of number
                System.out.print(i + " ");
            }
        }
        
        // Close the scanner stream
        sc.close();
    }
}