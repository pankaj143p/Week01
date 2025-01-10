import java.util.Scanner;
// Create a class DistanceConverterFeet
class DistanceConverterFeet {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        // Declare the distance in feet
        double distanceInFeet;
        // Take input for the distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = sc.nextDouble();
        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet/3;
        double distanceInMiles = distanceInFeet/5280;
        // display all the results
        System.out.println("Your distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards + " and miles is " + distanceInMiles);
        
        sc.close();
    }
}
