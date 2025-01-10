import java.util.Scanner;
// Create a class SquareSide
class SquareSides {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        // Declare the perimeter variable
        double perimeter;
        // Take input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        perimeter = sc.nextDouble();
        // Calculate the side length of the square
        double sideLength = perimeter / 4;
        // Output the result
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);
        sc.close();
    }
}
