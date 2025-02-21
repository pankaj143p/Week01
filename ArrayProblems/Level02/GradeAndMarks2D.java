
import java.util.Scanner;

public class GradeAndMarks2D {
    // Function to take and validate marks for a subject
    public static int getMarks(Scanner sc, String subject) {
        int marks;
        do {
            System.out.print(subject + " marks: ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    // Function to calculate the percentage
    public static double calculatePercentage(int totalMarks) {
        return totalMarks / 3.0;
    }

    // Function to determine the grade based on percentage
    public static String determineGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R"; // Fail
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths for each
        // student
        int[][] studentMarks = new int[numberOfStudents][3];

        // Arrays to store percentages and grades for each student
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Process each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Get valid marks for each subject and store them in the 2D array
            studentMarks[i][0] = getMarks(sc, "Physics");
            studentMarks[i][1] = getMarks(sc, "Chemistry");
            studentMarks[i][2] = getMarks(sc, "Maths");

            // Calculate total marks and percentage
            int totalMarks = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            percentages[i] = calculatePercentage(totalMarks);

            // Determine grade based on percentage
            grades[i] = determineGrade(percentages[i]);
        }

        // Display the marks, percentage, and grade for each student
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + studentMarks[i][0]);
            System.out.println("Chemistry: " + studentMarks[i][1]);
            System.out.println("Maths: " + studentMarks[i][2]);
            System.out.println("Percentage: " + percentages[i] + " %");
            System.out.println("Grade: " + grades[i]);
        }

        // Close the scanner
        sc.close();
    }
}
