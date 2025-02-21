import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ManyRouns {
    // This method calculates how many rounds the athlete needs to run
    // to complete 5 kilometers, based on the perimeter of the triangle.
    public static int calculateRounds(double perimeter)  {
        // 5000 meters is equal to 5 kilometers
        double totalDistance = 5000;
        // Calculate the number of rounds needed
        // Round up because even if there's a small extra part of a round,
        // the athlete needs to complete a full round.
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) throws IOException {
        // Using BufferedReader to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Prompt the user to enter the side lengths of the triangle
            System.out.println("Enter the length of the first side of the triangle (in meters):");
            double side1 = Double.parseDouble(br.readLine());
            System.out.println("Enter the length of the second side of the triangle (in meters):");
            double side2 = Double.parseDouble(br.readLine());
            System.out.println("Enter the length of the third side of the triangle (in meters):");           
            double side3 = Double.parseDouble(br.readLine());
            // Calculate the perimeter of the triangle
            double perimeter = side1 + side2 + side3;
            // Calculate how many rounds are needed to complete 5 kilometers
            int roundsNeeded = calculateRounds(perimeter);
            // Display the result to the user
            System.out.println("To complete a 5 km run, you need to run " + roundsNeeded + " rounds of the triangle.");
    }
}
