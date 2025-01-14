import java.util.Scanner;

public class CanVote{

    // Method to generate random 2-digit age for each student
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Random age between 10 and 99
        }
        return ages;
    }

    // Method to determine if the student can vote based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            // Validate the age and check if it's valid for voting
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote"; // Eligible to vote
            } else {
                result[i][1] = "Cannot Vote"; // Not eligible to vote
            }
        }
        return result;
    }

    // Method to display the result in a tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt(); // Number of students

        if (n != 10) {
            System.out.println("The program only accepts input for exactly 10 students.");
            return;
        }

        int[] ages = generateAges(n);

        String[][] result = checkVotingEligibility(ages);

        // Display the results
        displayResult(result);
    }
}
