    import java.util.Scanner;
    // Create BMI_Calculator class to calculate and display BMI for multiple persons
    public class BMI{
        public static void main(String[] args) {
            // Create a scanner object to read user input
            Scanner scanner = new Scanner(System.in);
    
            // Display a message asking for the number of persons to input BMI data for
            System.out.print("Enter the number of persons: ");
            // Read the number of persons
            int numberOfPersons = scanner.nextInt();    
            // Create arrays to store height, weight, BMI, and weight status for each person
            double[] heights = new double[numberOfPersons];
            double[] weights = new double[numberOfPersons];
            double[] bmis = new double[numberOfPersons];
            String[] weightStatus = new String[numberOfPersons];   
            // Loop to gather data for each person
            for (int i = 0; i < numberOfPersons; i++) {
                // Display message for entering data for each person
                System.out.println("Person " + (i + 1)); 
                // Prompt the user to enter the height of the person
                System.out.print("Enter height (in meters): ");
                // Read the height of the person
                heights[i] = scanner.nextDouble();
                // Prompt the user to enter the weight of the person
                System.out.print("Enter weight (in kilograms): ");
                // Read the weight of the person
                weights[i] = scanner.nextDouble();
                // Calculate BMI using the formula: BMI = weight / (height^2)
                bmis[i] = weights[i] / (heights[i] * heights[i]);
                // Determine the weight status based on BMI ranges
                if (bmis[i] < 18.5) {
                    weightStatus[i] = "Underweight";  // BMI < 18.5
                } else if (bmis[i] < 24.9) {
                    weightStatus[i] = "Normal weight";  // 18.5 ≤ BMI < 24.9
                } else if (bmis[i] < 29.9) {
                    weightStatus[i] = "Overweight";  // 25 ≤ BMI < 29.9
                } else {
                    weightStatus[i] = "Obese";  // BMI ≥ 30
                }
            }
    
            // Print the BMI results for each person in a formatted table
            System.out.println("\nBMI Details for Each Person:");
            System.out.println("-----------------------------------------------------------");
    
            // Display the column headers in the output table
            System.out.printf("%-10s %-10s %-10s %-15s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
    
            // Loop to display each person's data in the table
            for (int i = 0; i < numberOfPersons; i++) {
                // Print each person's height, weight, BMI, and weight status
                System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), heights[i], weights[i], bmis[i], weightStatus[i]);
            }
    
            // Display a message after all the information is printed
            System.out.println("\nThe BMI and weight status for all persons have been displayed.");
            
            // Close the scanner object to free up the resources
            scanner.close();
        }
    }
    