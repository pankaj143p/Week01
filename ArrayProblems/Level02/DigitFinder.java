import java.util.Scanner;

class DigitFinder {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Declare the initial size of the array and other necessary variables
      int maxDigit = 10; // Set the initial max size of the array
      int[] digits = new int[maxDigit]; // Array to store the digits
      int number, index = 0; // Initialize number and index

      // Variables to store the largest and second largest digits
      int largest = -1, secondLargest = -1;

      // Take user input for the number
      System.out.print("Enter a number: ");
      number = input.nextInt();

      // Loop to store the digits in the array
      while (number != 0) {
         // Check if index equals the maxDigit (array is full)
         if (index == maxDigit) {
            // Increase maxDigit by 10 to resize the array
            maxDigit += 10;
            
            // Create a new temporary array with the increased size
            int[] tempArray = new int[maxDigit];
            
            // Copy all digits from the old array to the new array
            System.arraycopy(digits, 0, tempArray, 0, digits.length);
            
            // Assign the new array back to digits array
            digits = tempArray;
         }

         // Store the last digit in the array
         digits[index] = number % 10;
         
         // Remove the last digit from the number
         number = number / 10;
         
         // Increment the index for the next digit
         index++;
      }

      // Find the largest and second largest digits
      for (int i = 0; i < index; i++) {
         // If current digit is greater than the largest, update largest and second largest
         if (digits[i] > largest) {
            secondLargest = largest;
            largest = digits[i];
         } 
         // If current digit is greater than second largest and not equal to largest, update second largest
         else if (digits[i] > secondLargest && digits[i] != largest) {
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
