import java.util.Scanner;

public class BMIString {

    // Method to calculate BMI and status based on weight and height
    public static String[] calculateBMIAndStatus(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;

        double bmi = weight / (height * height);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return the results as a string array
        return new String[]{String.format("%.2f", weight), String.format("%.2f", height * 100), String.format("%.2f", bmi), status};
    }

    // Method to process the height and weight of all persons and store BMI and status in a 2D string array
    public static String[][] processBMIData(double[][] data) {
        String[][] result = new String[10][4]; // 2D array to store height, weight, BMI and status

        for (int i = 0; i < 10; i++) {
            result[i] = calculateBMIAndStatus(data[i][0], data[i][1]); // Calculate BMI and status for each person
        }

        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s%-10s%-10s%-15s%n", data[i][1], data[i][0], data[i][2], data[i][3]);
        }
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2]; // 2D array to store weight and height for each person

        // Taking input for 10 persons
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter data for person %d:\n", i + 1);
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Process the BMI data and get results
        String[][] bmiData = processBMIData(personData);

        // Display the results
        displayResults(bmiData);

        scanner.close();
    }
}
