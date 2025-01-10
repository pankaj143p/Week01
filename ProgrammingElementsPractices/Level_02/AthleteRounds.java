import java.util.Scanner;
// Create AthleteRounds Class to calculate rounds in a triangular park
class AthleteRounds {
   public static void main(String[] args) {

      // Create a Scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Get user inputs for the sides of the triangle
      System.out.print("Enter the first side of the triangle in meters: ");
      // Read the first side of the triangle from the user
      double side1 = sc.nextDouble();
      System.out.print("Enter the second side of the triangle in meters: ");
      // Read the second side of the triangle from the user
      double side2 = sc.nextDouble();
      System.out.print("Enter the third side of the triangle in meters: ");
      // Read the third side of the triangle from the user
      double side3 = sc.nextDouble();
      // Calculate the perimeter of the triangle
      double perimeter = side1+side2+side3;
      // Calculate the number of rounds to complete 5 km
      double rounds = 5000/perimeter;
      // Print the number of rounds
      System.out.println("The total number of rounds the athlete will run is " + rounds);
   }
}
