import java.util.Scanner;

public class EquationDistance {

    // Method to find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Formula for Euclidean distance: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Formula for slope (m): m = (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);

        // Formula for y-intercept (b): b = y1 - m * x1
        double yIntercept = y1 - (slope * x1);

        // Return the slope and y-intercept as an array
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input coordinates of the two points (x1, y1) and (x2, y2)
        System.out.print("Enter the x-coordinate of the first point (x1): ");
        double x1 = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the first point (y1): ");
        double y1 = sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point (x2): ");
        double x2 = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the second point (y2): ");
        double y2 = sc.nextDouble();

        // Calculate and print the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the two points is: %.2f\n", distance);

        // Find the equation of the line and print it
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        System.out.printf("The equation of the line is: y = %.2fx + %.2f\n", slope, yIntercept);
    }
}
