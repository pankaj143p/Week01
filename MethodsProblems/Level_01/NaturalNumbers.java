import java.util.Scanner;
public class NaturalNumbers {
    // Method to calculate the sum of natural numbers from 1 to n
    public int sum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter the value of n: ");

        int n = sc.nextInt();
        // Create an object of NaturalNumbers class
        NaturalNumbers nn = new NaturalNumbers();
        // Displaying the natural numbers from 1 to n
        System.out.println("The natural numbers from 1 to "+n+" are: "+nn.sum(n));
    }
}
