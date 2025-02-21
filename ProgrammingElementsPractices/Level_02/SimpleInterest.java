import java.util.Scanner;
// Create SimpleInterest Class to calculate simple interest
class SimpleInterest {
   public static void main(String[] args) {
      // Create a Scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Get user inputs for Principal, Rate, and Time
      System.out.print("Enter Principal: ");
      // Read the Principal from the user
      double principal = sc.nextDouble();
      System.out.print("Enter Rate of Interest: ");
      // Read the Rate of Interest from the user
      double rate = sc.nextDouble();
      System.out.print("Enter Time (in years): ");
      // Read the Time from the user
      double time = sc.nextDouble();
      // Calculate Simple Interest using the formula: Simple Interest = Principal * Rate * Time / 100
      double simpleInterest = (principal * rate * time) / 100;
      // Display the Simple Interest
      System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
   }
}
