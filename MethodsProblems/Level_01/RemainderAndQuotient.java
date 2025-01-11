import java.util.Scanner;
public class RemainderAndQuotient {
    public int[] remainderAndQuotient(int dividend, int divisor){
        return new int[]{dividend%divisor, dividend/divisor};
    }
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        // Displaying the remainder and quotient
        RemainderAndQuotient rq = new RemainderAndQuotient();
        int [] result = rq.remainderAndQuotient(dividend, divisor);
        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);
        
    }
}
