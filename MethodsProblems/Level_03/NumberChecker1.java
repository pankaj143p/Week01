import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker1 {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number. Create a 2D array to store the frequency.
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // Frequency array for digits 0-9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Store digit
            frequency[i][1] = 0; // Initialize frequency count
        }

        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        // Remove digits that don't appear (i.e., frequency is 0)
        int nonZeroCount = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                nonZeroCount++;
            }
        }

        int[][] result = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                result[index] = frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Store digits of the number
        int[] digits = storeDigits(number);      
        // Count digits
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + count);
        // Display the digits
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        // Sum of digits
        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of the digits: " + sumOfDigits);
        // Sum of the squares of the digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of the squares of the digits: " + sumOfSquares);
        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(digits, number);
        System.out.println("Is the number a Harshad number? " + (isHarshad ? "Yes" : "No"));
        // Find the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] entry : frequency) {
            System.out.println("Digit " + entry[0] + ": " + entry[1] + " times");
        }

        sc.close();
    }
}

