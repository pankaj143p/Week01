import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        // Declare the max size of the array and other necessary variables
        final int MAX_DIGIT = 10;
        int[] digits = new int[MAX_DIGIT];
        int number, index = 0;
        // Variables to store the largest and second largest digits
        int largest = -1, secondLargest = -1;
        // Take user input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        // Loop to store the digits in the array
        while (number != 0) {
            digits[index] = number % 10; // Store the last digit in the array
            number = number / 10; // Remove the last digit from the number
            index++;

            // If index reaches the max limit, break the loop
            if (index == MAX_DIGIT) {
                break;
            }
        }

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        if (largest != -1) {
            System.out.println("The largest digit is: " + largest);
            if (secondLargest != -1) {
                System.out.println("The second largest digit is: " + secondLargest);
            } else {
                System.out.println("There is no second largest digit.");
            }
        } else {
            System.out.println("No valid digits found.");
        }

        // Close the Scanner Object
        input.close();
    }

}
