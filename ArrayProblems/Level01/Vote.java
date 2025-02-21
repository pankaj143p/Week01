import java.util.Scanner;
class Vote{
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        // Get user sc for 10 students' ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            // Validate the age and check if the student can vote
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}
