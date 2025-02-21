package Level_01;

import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);       
        // Declare the number variable to store the input
        int number;       
        // Take input for the number
        System.out.print("Enter a number to print its multiplication table (from 6 to 9): ");
        number = sc.nextInt(); 
        // Using a for loop to print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Close the scanner stream
        sc.close();
    }
}