import java.util.Scanner;

// Create a class TotalHandshakes to calculate the maximum number of handshakes
public class TotalHandshakes {
      public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        // Declare variable for number of students
        int numberOfStudents;
        // Take input for number of students
        System.out.print("Enter the number of students: ");
        numberOfStudents = sc.nextInt();
        // Calculate the number of handshakes using the formula
        int handshakes = (numberOfStudents*(numberOfStudents-1))/2;
        // Display all the results
        System.out.println("The maximum number of handshakes is " + handshakes);
        sc.close();
    }
}