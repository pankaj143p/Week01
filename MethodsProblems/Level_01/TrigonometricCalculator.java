import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate trigonometric functions: sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent of the angle
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        // Return the results as an array of doubles
        return new double[]{sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an instance of TrigonometricCalculator
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Calculate the trigonometric values
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.printf("For an angle of %.2f degrees:\n", angle);
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);

        // Close the scanner
        scanner.close();
    }
}