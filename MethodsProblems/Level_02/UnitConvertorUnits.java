import java.util.Scanner;
public class UnitConvertorUnits {
    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        double yards = sc.nextDouble();
        // Display the output
        System.out.println("Feet: " + convertYardsToFeet(yards));
        double feet = sc.nextDouble();
        System.out.println("Yards: " + convertFeetToYards(feet));
        double meters = sc.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));
        double inches = sc.nextDouble();
        System.out.println("Meters: " + convertInchesToMeters(inches));
        double inches1 = sc.nextDouble();
        System.out.println("Centimeters: " + convertInchesToCm(inches));  
    }
}
