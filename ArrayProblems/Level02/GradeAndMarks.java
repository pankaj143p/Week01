
import java.util.Scanner;
// Create a Pair class to store two values: one integer and one string
class Pair {
    int number;
    String status;

    public Pair(int number, String status) {
        this.number = number;
        this.status = status;
    }
}
public class GradeAndMarks {
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

        // Arrays to store marks, pairs of marks, and pair for total marks and grade
        Pair[] physicsMarks = new Pair[numberOfStudents];
        Pair[] chemistryMarks = new Pair[numberOfStudents];
        Pair[] mathsMarks = new Pair[numberOfStudents];
        Pair[] studentTotalData = new Pair[numberOfStudents];

        // Process each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Get valid marks for each subject, stored in Pair class
            int physics = getMarks(sc, "Physics");
            int chemistry = getMarks(sc, "Chemistry");
            int maths = getMarks(sc, "Maths");

            // Create pairs to store subject marks
            physicsMarks[i] = new Pair(physics, "");
            chemistryMarks[i] = new Pair(chemistry, "");
            mathsMarks[i] = new Pair(maths, "");

            // Calculate total marks and percentage
            int totalMarks = physics + chemistry + maths;
            double percentage = calculatePercentage(totalMarks);

            // Determine grade based on percentage
            String grade = determineGrade(percentage);

            // Store total marks and grade in a pair
            studentTotalData[i] = new Pair(totalMarks, grade);

            // Output details for the student
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i].number);
            System.out.println("Chemistry: " + chemistryMarks[i].number);
            System.out.println("Maths: " + mathsMarks[i].number);
            System.out.println("Percentage: " + percentage + " %");
            System.out.println("Grade: " + studentTotalData[i].status);
        }

        // Close the scanner
        sc.close();
    }
}
