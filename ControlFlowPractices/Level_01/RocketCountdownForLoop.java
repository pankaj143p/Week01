package Level_01;

import java.util.Scanner;
class RocketCountdownForLoop {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare the counter variable to store the countdown start value
        int counter;
        
        // Take input for countdown start value
        System.out.print("Enter the countdown start number: ");
        counter = sc.nextInt();
        
        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        
        // Print final message after countdown
        System.out.println("Rocket launched!");
        
        // Close the scanner stream
        sc.close();
    }
}