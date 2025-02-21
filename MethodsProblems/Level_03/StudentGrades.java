import java.util.Random;
import java.util.Scanner;
public class StudentGrades {
    
        // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for each student
        public static int[][] generateScores(int numStudents) {
            Random rand = new Random();
            int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, and Maths
    
            for (int i = 0; i < numStudents; i++) {
                // Generating random scores between 10 and 99 (inclusive)
                scores[i][0] = rand.nextInt(90) + 10; // Physics
                scores[i][1] = rand.nextInt(90) + 10; // Chemistry
                scores[i][2] = rand.nextInt(90) + 10; // Maths
            }
            return scores;
        }
    
        // Method to calculate total, average, and percentage for each student
        public static double[][] calculateResults(int[][] scores) {
            double[][] results = new double[scores.length][4]; // Total, Average, Percentage, and Student ID
            
            for (int i = 0; i < scores.length; i++) {
                int total = 0;
                for (int j = 0; j < 3; j++) {
                    total += scores[i][j]; // Summing the scores
                }
                double average = total / 3.0; // Calculating the average
                double percentage = (total / 300.0) * 100; // Calculating the percentage out of 300
    
                // Storing results
                results[i][0] = total;
                results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
                results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
                results[i][3] = i + 1; // Storing student ID (1-indexed)
            }
            return results;
        }
    
        // Method to display the scorecard in a tabular format
        public static void displayScoreCard(int[][] scores, double[][] results) {
            System.out.println("\nScorecard:");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Student ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
            System.out.println("--------------------------------------------------------------");
    
            // Displaying each student's data
            for (int i = 0; i < scores.length; i++) {
                System.out.printf("%d\t\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n",
                        (int) results[i][3], scores[i][0], scores[i][1], scores[i][2],
                        results[i][0], results[i][1], results[i][2]);
            }
            System.out.println("--------------------------------------------------------------");
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Take the number of students as input
            System.out.print("Enter the number of students: ");
            int numStudents = sc.nextInt();
    
            // Generate random scores for all students
            int[][] scores = generateScores(numStudents);
    
            // Calculate total, average, and percentage for each student
            double[][] results = calculateResults(scores);
    
            // Display the scorecard of all students
            displayScoreCard(scores, results);
        }
    }
    