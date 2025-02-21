import java.util.Scanner;

// Create ReverseNum class to reverse the number
public class ReverseNum {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Please enter a number: ");
        int originalNumber = scanner.nextInt();

        // Find how many digits the number has
        int tempNumber = originalNumber;
        int digitCount = 0;

        // Count the number of digits in the number
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }

        // Create an array to store the digits of the number
        int[] digitsArray = new int[digitCount];

        // Reset tempNumber to the original number
        tempNumber = originalNumber;
        int index = 0;

        // Store each digit of the number in the array
        while (tempNumber != 0) {
            digitsArray[index] = tempNumber % 10; // Get the last digit
            tempNumber = tempNumber / 10; // Remove the last digit
            index++;
        }

        // Create a new array to store the digits in reversed order
        int[] reversedArray = new int[digitCount];

        // Reverse the digits and store them in reversedArray
        for (int i = 0; i < digitCount; i++) {
            reversedArray[i] = digitsArray[digitCount - 1 - i];
        }

        // Display the reversed number
        System.out.print("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedArray[i]);
        }

        // Close the scanner object
        scanner.close();
    }
}
