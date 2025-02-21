import java.util.Scanner;
public class WindChild {    
        // Method to calculate the wind chill temperature
        public double calculateWindChill(double temperature, double windSpeed) {
            // Formula for wind chill calculation
            double windChill = 35.74 + 0.6215 * temperature + 
                               (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
            return windChill;
        }   
        public static void main(String[] args) {
            // Create a scanner object to read user input
            Scanner sc = new Scanner(System.in);
    
            // Prompt user for temperature and wind speed
            System.out.print("Enter the temperature in Fahrenheit: ");
            double temperature = sc.nextDouble();
    
            System.out.print("Enter the wind speed in miles per hour: ");
            double windSpeed = sc.nextDouble();
    
            // Create an instance of WindChild to use its method
            WindChild calculator = new WindChild(); 
            // Calculate the wind chill
            double windChill = calculator.calculateWindChill(temperature, windSpeed);
            // Output the result
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
            // Close the scanner
            sc.close();
        }
    }
    