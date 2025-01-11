import java.util.Arrays;
public class NumberChecker3 {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number; 
    }
    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product; 
    }
    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String strNumber = String.valueOf(number);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strNumber); // Square ends with the number itself
    }
    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // Divisible by 7 or ends with 7
    }
    // Method to store digits of the number in an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static void main(String[] args) {
        // Reading user input using System.console()
        String numberInput = System.console().readLine("Enter a number: ");
        int number = Integer.parseInt(numberInput);
        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is the number prime? " + (prime ? "Yes" : "No"));
        // Check if the number is a neon number
        boolean neon = isNeon(number);
        System.out.println("Is the number a neon number? " + (neon ? "Yes" : "No"));
        // Check if the number is a spy number
        boolean spy = isSpyNumber(number);
        System.out.println("Is the number a spy number? " + (spy ? "Yes" : "No"));
        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is the number an automorphic number? " + (automorphic ? "Yes" : "No"));
        // Check if the number is a buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println("Is the number a buzz number? " + (buzz ? "Yes" : "No"));
    }
}
