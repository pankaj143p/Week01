import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Converted: " + fahrenheitToCelsius(temp) + " °C");
        } else {
            System.out.println("Converted: " + celsiusToFahrenheit(temp) + " °F");
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
