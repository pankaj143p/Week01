import java.util.Scanner;
// Create a class TotalPriceCalculator
class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in); 
        // Declare variables for unit price and quantity
        double unitPrice, totalPrice;
        int quantity;
        // Take input for unit price and quantity
        System.out.print("Enter the unit price: ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();
        // Calculate the total price
        totalPrice = unitPrice * quantity;
        // Display all the results
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        sc.close();
    }
}
