import java.util.Scanner;

// Create a class FeeDiscount
class FeeDiscount {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc=new Scanner(System.in);
        // Declare variables for fee and discount percentage
        double fee, discountPercent, discountAmount, finalFee;
        // Take the input for fee and discount percentage
        System.out.print("Enter the student fee: ");
        fee = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountPercent = sc.nextDouble();
        // Calculate the discount amount
        discountAmount=(fee*discountPercent)/100;
        // Calculate the final fee after discount
        finalFee=fee-discountAmount;
        // display all the results
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
        sc.close();
    }
}
