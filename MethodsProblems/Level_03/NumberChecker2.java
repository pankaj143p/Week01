import java.util.Arrays;

public class NumberChecker2 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // A Duck number contains a non-zero digit
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String numberInput = System.console().readLine("Enter a number: ");
        int number = Integer.parseInt(numberInput);
        // Store digits of the number
        int[] digits = storeDigits(number);
        // Count digits
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + count);
        // Display the digits
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        // Check if the number is a palindrome
        boolean palindrome = isPalindrome(digits);
        System.out.println("Is the number a palindrome? " + (palindrome ? "Yes" : "No"));
        // Check if the number is a Duck number
        boolean duck = isDuckNumber(digits);
        System.out.println("Is the number a Duck number? " + (duck ? "Yes" : "No"));
        // Reverse the digits and print them
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        // Compare original and reversed digits
        boolean arraysEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are the original and reversed digits equal? " + (arraysEqual ? "Yes" : "No"));
    }
}
