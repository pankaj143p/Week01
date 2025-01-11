import java.util.Scanner;
public class NumberCheck {
            // Method to check if the number is positive or negative
        public static String isPositiveOrNegative(int number) {
            if (number >= 0) {
                return "positive";
            } else {
                return "negative";
            }
        }
        // Method to check if the number is even or odd
        public static String isEvenOrOdd(int number) {
            if (number % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
        }
        // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, or -1 if number1 < number2
        public static int compare(int number1, int number2) {
            if (number1 > number2) {
                return 1;
            } else if (number1 == number2) {
                return 0;
            } else {
                return -1;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5]; 
            // Taking input for 5 numbers
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
    
                String posOrNeg = isPositiveOrNegative(numbers[i]);
                System.out.println(numbers[i] + " is " + posOrNeg);
    
                if (numbers[i] >= 0) {
                    String evenOrOdd = isEvenOrOdd(numbers[i]);
                    System.out.println(numbers[i] + " is " + evenOrOdd);
                }
            }
            // Compare the first and last numbers
            int comparison = compare(numbers[0], numbers[4]);
            if (comparison == 1) {
                System.out.println("First number is greater than the last number.");
            } else if (comparison == 0) {
                System.out.println("First number is equal to the last number.");
            } else {
                System.out.println("First number is less than the last number.");
            }
    
            sc.close();
        }
    }
    