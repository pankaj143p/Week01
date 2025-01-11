import java.util.Scanner;
// Create StudentGrades class compute the percentage and then calculate the grade
public class StudentGrades {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Marks in physics, chemistry, and maths
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        // Store percentages, and grades in array
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        // Enter the marks of students
       for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            // Enter Physics marks
            do {
                System.out.print("Physics marks: ");
                physicsMarks[i] = input.nextInt();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } while (physicsMarks[i] < 0 || physicsMarks[i] > 100);
            // Enter Chemistry marks
            do {
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = input.nextInt();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100);
            // Enter Maths marks
            do {
                System.out.print("Maths marks: ");
                mathsMarks[i] = input.nextInt();
                if (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } while (mathsMarks[i] < 0 || mathsMarks[i] > 100);
            // Calculate percentage and total marks
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = totalMarks / 3.0;
            // Calculate grade
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        // Display marks, percentages, and grades for each student
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + " %");
            System.out.println("Grade: " + grades[i]);
        }
        // Close the scanner
        input.close();
    }
}
