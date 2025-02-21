import java.util.Scanner;
class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);       
        // Declare variable to store the number
        int number;       
        // Take input for number
        System.out.print("Enter a number: ");
        number = sc.nextInt();    
        // Declare the greatestFactor variable and initialize it to 1
        int greatestFactor = 1;        
        // Use a for loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of number
            if (number % i == 0) {
                // Assign i to greatestFactor and break the loop
                greatestFactor = i;
                break;
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        
        // Close the scanner stream
        sc.close();
    }
}