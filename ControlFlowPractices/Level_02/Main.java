import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);        
        // Take input for marks in Physics
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();       
        // Take input for marks in Chemistry
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        // Take input for marks in Maths
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
        // Calculate total marks by adding marks in all subjects
        int totalMarks = physics + chemistry + maths;
        
        // Calculate average marks (use 3.0 to ensure it's a double result)
        double averageMarks = totalMarks / 3.0;
        
        // Calculate percentage based on total marks (out of 300)
        double percentage = (totalMarks / 300.0) * 100;
        
        // Declare variables to store grade and remarks
        char grade;
        String remarks;
        
        // Determine the grade and remarks based on percentage
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
        
        // Output results with two decimal places for average marks and percentage
        System.out.printf("\nAverage Marks: %.2f%n", averageMarks);  // Display average marks with two decimal precision
        System.out.printf("Percentage: %.2f%%%n", percentage);       // Display percentage with two decimal precision
        System.out.println("Grade: " + grade);                        // Display the grade
        System.out.println("Remarks: " + remarks);                    // Display the remarks based on grade
        
        // Close the scanner to release resources
        scanner.close();
    }
}