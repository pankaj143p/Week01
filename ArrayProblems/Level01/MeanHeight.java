import java.util.Scanner;
class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        // Get heights of players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        // Calculate and display mean
        double mean = sum / heights.length;
        System.out.println("The mean height of the team is: " + mean);

        sc.close();
    }
}
 