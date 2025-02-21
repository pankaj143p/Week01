import java.util.Scanner;
public class CanVote {
        // Method to check if a student can vote
        public boolean canStudentVote(int age) {
            if (age < 0) {
                return false; 
            } else if (age >= 18) {
                return true; 
            } else {
                return false; 
            }
        }
    
         public static void main(String[] args) {
            // Scanner class to take user input
            Scanner sc = new Scanner(System.in);

            int students [] = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter the age of student " + (i+1) + ": ");
                students[i] = sc.nextInt();
            }
            // Creating an object of the class
            CanVote obj = new CanVote();
              
            for (int i = 0; i < 10; i++) {
                // display the output
                if(obj.canStudentVote(students[i])){
                    System.out.println("Student " + (i+1) + " can vote");
                }
                else{
                    System.out.println("Student " + (i+1) + " cannot vote");
                }
            }
         }
        }