import java.util.Scanner;
public class RewriteBMI {
    
        public static void main(String[] args) {
            // Create a scanner object to read user input
            Scanner scanner = new Scanner(System.in);
            // Ask the user to input the number of persons
            System.out.print("Enter the number of persons: ");
            int numberOfPersons = scanner.nextInt();
    
            // Create a 2D array to store height, weight, and BMI for each person
            // The array has rows for each person, and 3 columns for [height, weight, BMI]
            double[][] personData = new double[numberOfPersons][3];
    
            // Create an array to store the weight status for each person
            String[] weightStatus = new String[numberOfPersons];
    
            // Loop to take input for each person
            for (int i = 0; i < numberOfPersons; i++) {
                System.out.println("\nPerson " + (i + 1));
    
                // Input height for each person and validate the input
                double height;
                do {
                    System.out.print("Enter height (in meters): ");
                    height = scanner.nextDouble();
                    if (height <= 0) {
                        System.out.println("Height must be a positive number. Please enter again.");
                    }
                } while (height <= 0); // Keep asking until a positive value is entered
                personData[i][0] = height; // Store the height in the personData array
    
                // Input weight for each person and validate the input
                double weight;
                do {
                    System.out.print("Enter weight (in kilograms): ");
                    weight = scanner.nextDouble();
                    if (weight <= 0) {
                        System.out.println("Weight must be a positive number. Please enter again.");
                    }
                } while (weight <= 0); // Keep asking until a positive value is entered
                personData[i][1] = weight; // Store the weight in the personData array
    
                // Calculate BMI: BMI = weight / (height^2)
                double bmi = weight / (height * height);
                personData[i][2] = bmi; // Store the BMI in the personData array
    
                // Determine the weight status based on BMI
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 24.9) {
                    weightStatus[i] = "Normal weight";
                } else if (bmi < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }
    
            // Display the BMI results for each person
            System.out.println("\nBMI Details for Each Person:");
            System.out.println("-----------------------------------------------------------");
    
            // Print the column headers
            System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
    
            // Loop through the 2D array and print each person's details
            for (int i = 0; i < numberOfPersons; i++) {
                // Print each person's details in a row
                System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
            }
    
            // Close the scanner object
            scanner.close();
        }
    }
    