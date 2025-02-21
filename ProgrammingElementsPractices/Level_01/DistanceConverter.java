import java.util.Scanner;
// Create a class DistanceConverter
class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc=new Scanner(System.in);
        // Declare the km variable to store input distance in kilometers
        double km;
        // Take the input for km
        System.out.print("Enter the distance in kilometers: ");
        km = sc.nextDouble();
        // Calculate the equivalent distance in miles using the formula
        double miles=km/1.6;
        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        sc.close();
    }
}
