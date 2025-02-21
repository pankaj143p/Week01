import java.util.Scanner;

class YoungetsAndTallest{
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        // Declare arrays to store ages and heights
        int ages[] = new int[3];
        double heights[] = new double[3];
        // Declare variables for youngest and tallest
        int youngest = 0;
        double tallest = 0;
        // Input the ages and heights for 3 people
        for(int i = 0; i < 3; i++){
            System.out.println("Enter the age of person " + (i+1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of person " + (i+1) + ": ");
            heights[i] = sc.nextDouble();
            }
        // Determine the youngest and tallest
        for(int i = 0; i < 3; i++){
            if(ages[i] < ages[youngest]){
                youngest = i;
            }
            if(heights[i] > heights[(int)tallest]){
                tallest = i;
            }
        }
        // Display the youngest and tallest
        System.out.println("The youngest person is person " + (youngest + 1) + " with age " + ages[youngest]);
    }
}