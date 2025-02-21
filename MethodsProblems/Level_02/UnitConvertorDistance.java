import java.util.Scanner;
public class UnitConvertorDistance {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

     public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        double km = sc.nextDouble();
        // Display the output
        System.out.println(km + " km is equal to " + convertKmToMiles(km) + " miles");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " km");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters");
        

     }
}