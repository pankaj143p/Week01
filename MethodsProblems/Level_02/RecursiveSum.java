import java.util.Scanner;
public class RecursiveSum {
    // Method to find the sum of factors of a number
    public int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    // sum of upto n numbers is n*(n+1)/2
    public int sum2(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Creating an object of the class
        RecursiveSum obj = new RecursiveSum();
        // compare the output of sum and sum2
        if(obj.sum(n)==obj.sum2(n)){
            System.out.println("Both methods give the same output");
        }
        else{
            System.out.println("Both methods give different output");
        }
        System.out.println("Sum of numbers upto " + n + " is: " + obj.sum2(n));
        System.out.println("Sum of factors of " + n + " is: " + obj.sum(n));
    }
}