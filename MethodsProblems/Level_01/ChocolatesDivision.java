import java.util.Scanner;
public class ChocolatesDivision {
        public int[] chocolatesDivision(int n, int m){
            return new int[]{n%m, n/m};
        }
        public static void main(String[] args) {
            // Scanner object to take input from user
            Scanner sc = new Scanner(System.in);
            // Taking input from user
            System.out.println("Enter the n: ");
            int n = sc.nextInt();
            System.out.println("Enter the m: ");
            int m = sc.nextInt();
            // Displaying the remainder and quotient
            ChocolatesDivision cd = new ChocolatesDivision();
            int [] result = cd.chocolatesDivision(n, m);
            System.out.println("equal chocolatess: " + result[0]);
            System.out.println("remaining chocolatess: " + result[1]);            
        }
    }
    