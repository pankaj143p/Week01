import java.util.Scanner;
public class TriangleChecks {
            // Method to calculate the slope between two points
        public static double calculateSlope(int x1, int y1, int x2, int y2) {
            if (x2 - x1 == 0) {
                return Double.MAX_VALUE;
            }
            return (double)(y2 - y1) / (x2 - x1);
        }
        // Method to check if the three points are collinear using the slope formula
        public static boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
            double slopeAB = calculateSlope(x1, y1, x2, y2);
            double slopeBC = calculateSlope(x2, y2, x3, y3);
            double slopeAC = calculateSlope(x1, y1, x3, y3);
            return (slopeAB == slopeBC && slopeBC == slopeAC);
        }
        // Method to check if the three points are collinear using the area of the triangle formula
        public static boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
            // Calculate the area of the triangle formed by three points
            double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
            
            // If the area is 0, then the points are collinear
            return area == 0;
        }
    
        public static void main(String[] args) {
            // Using 'sc' for the scanner
            Scanner sc = new Scanner(System.in);
    
            // Input points A(x1, y1), B(x2, y2), and C(x3, y3)
            System.out.print("Enter the coordinates of point A (x1,y1): ");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
    
            System.out.print("Enter the coordinates of point B (x2,y2): ");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
    
            System.out.print("Enter the coordinates of point C (x3,y3): ");
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
    
            // Check if points are collinear using slope method
            if (arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
                System.out.println("The points are collinear using the slope method.");
            } else {
                System.out.println("The points are NOT collinear using the slope method.");
            }
    
            // Check if points are collinear using area method
            if (arePointsCollinearByArea(x1, y1, x2, y2, x3, y3)) {
                System.out.println("The points are collinear using the area method.");
            } else {
                System.out.println("The points are NOT collinear using the area method.");
            }
    
            sc.close();
        }
    }
    