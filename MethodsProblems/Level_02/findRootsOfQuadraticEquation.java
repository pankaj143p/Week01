import java.util.Scanner;
public class findRootsOfQuadraticEquation {
    
    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // If delta is negative, return an empty array (no real roots)
        if (delta < 0) {
            return new double[0]; // No real roots
        }
        
        // If delta is zero, there is one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // One root
        }
        
        // If delta is positive, calculate two roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        // Return the two roots in an array
        return new double[]{root1, root2};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for a, b, and c
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        // Call the method to find the roots
        double[] roots = findRoots(a, b, c);
        
        // Output the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }
        
        sc.close();
    }
}
