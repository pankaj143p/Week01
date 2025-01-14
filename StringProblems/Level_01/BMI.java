import java.util.Scanner;
public class BMI {
            // Method to calculate BMI for each person
        public static void calculateBMI(double[][] data) {
            for (int i = 0; i < data.length; i++) {
                double weight = data[i][0];  
                double heightInCm = data[i][1];  
                double heightInMeters = heightInCm / 100; 
                double bmi = weight / (heightInMeters * heightInMeters); 
                data[i][2] = bmi;  
            }
        }
        // Method to determine the BMI status for each person
        public static String[] determineBMIStatus(double[][] data) {
            String[] statuses = new String[data.length];
            for (int i = 0; i < data.length; i++) {
                double bmi = data[i][2];  // BMI value from the array
                if (bmi < 18.5) {
                    statuses[i] = "Underweight";
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    statuses[i] = "Normal weight";
                } else if (bmi >= 25 && bmi < 29.9) {
                    statuses[i] = "Overweight";
                } else {
                    statuses[i] = "Obesity";
                }
            }
            return statuses;
        }
    
        // Main method to execute the program
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  
            // Create a 2D array to store the weight (kg), height (cm), and BMI for each person
            double[][] data = new double[10][3];  
    
            // Input the weight and height for each person
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter details for person " + (i + 1));
    
                // Get weight in kg
                System.out.print("Enter weight (kg): ");
                data[i][0] = sc.nextDouble();
    
                // Get height in cm
                System.out.print("Enter height (cm): ");
                data[i][1] = sc.nextDouble();
            }
    
            // Calculate the BMI for each person
            calculateBMI(data);
    
            // Determine the BMI status for each person
            String[] statuses = determineBMIStatus(data);
    
            // Display the results
            System.out.println("\nResults:");
            System.out.println("Person | Weight (kg) | Height (cm) | BMI   | Status");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%-7d| %-12.2f| %-13.2f| %-6.2f| %s\n", 
                                   i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
            }
    
        }
    }