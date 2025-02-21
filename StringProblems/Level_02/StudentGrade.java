import java.util.Random;

public class StudentGrade {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            // Generate random scores between 10 and 99 for each subject
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 300.0) * 100; 

            // Round off the values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70 && percentage<=79) {
                grades[i] = "B";
            } else if (percentage >= 60 && percentage<=69) {
                grades[i] = "C";
            } else if (percentage >= 50 && percentage<=59) {
                grades[i] = "D"; 
            } else if (percentage >= 40 && percentage<=49) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%d\t%.2f\t%.2f\t\t%s\n", 
                              i + 1, 
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              (int) results[i][0], 
                              results[i][1], 
                              results[i][2], 
                              grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;
        int[][] scores = generateScores(numStudents);

        double[][] results = calculateResults(scores);

        String[] grades = calculateGrades(results);

        // Display the scorecard in a tabular format
        displayScorecard(scores, results, grades);
    }
}
