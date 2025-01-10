import java.util.Scanner;
public class MaximumNumers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Create an array to store numbers
            double[] numbers = new double[10];
            double total = 0.0;
            int index = 0;
            // Get user input for numbers
            while (index < 10) {
                System.out.print("Enter a number (0 or negative to stop): ");
                double num = input.nextDouble();
                // Check if the number is 0 or negative
                if (num <= 0) {
                    break;
                }
                // Store the number and calculate the sum
                numbers[index] = num;
                total += num;
                index++;
            }
    
            // Display the numbers and the sum
            System.out.println("\nEntered numbers:");
            for (int i = 0; i < index; i++) {
                System.out.println(numbers[i]);
            } 
            System.out.println("\nTotal sum: " + total);
            input.close();
        }
    }
    
