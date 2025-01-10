import java.util.Scanner;
// Create WeightConversion Class to convert pounds to kilograms
class WeightConversion {
   public static void main(String[] args) {
      // Create a Scanner object to take user input
      Scanner sc = new Scanner(System.in);

      // Get the weight in pounds from user
      System.out.print("Enter weight in pounds: ");
      // Read the weight in pounds from the user
      double pounds = sc.nextDouble();
      // Convert pounds to kilograms (1 pound = 2.2 kg)
      double kilograms = pounds*2.2;

      // Print the result
      System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);
   }
}
