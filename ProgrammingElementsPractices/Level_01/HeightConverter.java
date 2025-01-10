import java.util.Scanner;

// Create a class HeightConverter
class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc=new Scanner(System.in);
        // Declare variable for height in centimeters
        double heightCm;
        // Take input for height in cm
        System.out.print("Enter your height in centimeters: ");
        heightCm=sc.nextDouble();
        // Convert height to feet and inches
        double heightInInches=heightCm/2.54;
        int feet=(int)(heightInInches/12);
        int inches=(int)(heightInInches%12);
        // Output the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        sc.close();
    }
}
