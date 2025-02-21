import java.util.Scanner;
// Create a class TriangleArea
class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object using 'sc' to take user input
        Scanner sc = new Scanner(System.in);
        // Declare variables for base and height
        double base, height;
        // Take input for base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
        // Calculate the area of the triangle
        double areaInCm2 = 0.5*base*height;
        double areaInInches2 = areaInCm2*0.155;
        // Output the result
        System.out.println("The area of the triangle is " + areaInCm2 + " square centimeters and " + areaInInches2 + " square inches.");  
        sc.close();
    }
}
