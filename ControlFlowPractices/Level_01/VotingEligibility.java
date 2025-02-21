package Level_01;

import java.util.Scanner;
class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);        
        // Declare the age variable to store the input age
        int age;       
        // Take input for age
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        // Check if the person can vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Close the scanner stream
        sc.close();
    }
}