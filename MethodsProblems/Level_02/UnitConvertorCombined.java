import java.util.Scanner;
public class UnitConvertorCombined {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        double fahrenheit = sc.nextDouble();
        // Display the output

        System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
        double kilograms = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));


    }
}
