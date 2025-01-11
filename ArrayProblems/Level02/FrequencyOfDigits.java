import java.util.Scanner;

public class FrequencyOfDigits {

     public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        // Read the number from the user
        int number = sc.nextInt();
        // Array to store the frequency of each digit
        int[] frequency = new int[10];
        // Count the frequency of each digit
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Increment the frequency of the digit
            frequency[digit]++;
            // Remove the last digit from the number
            number = number / 10;
        }
        // Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + " = " + frequency[i]);
            }
        }
        // Close the scanner object
        sc.close();

     }
}