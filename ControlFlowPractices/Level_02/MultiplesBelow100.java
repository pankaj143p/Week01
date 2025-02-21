import java.util.Scanner;
class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);       
        // Declare variable to store number
        int number;       
        // Take input for number
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        
        // Run a backward for loop from 100 to 1 to find multiples of the number
        System.out.println("The multiples of " + number + " below 100 are: ");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) { // If i is a multiple of the number
                System.out.print(i + " ");
            }
        }
        
        // Close the scanner stream
        sc.close();
    }
}