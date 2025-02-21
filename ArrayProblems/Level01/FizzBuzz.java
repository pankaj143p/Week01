import java.util.Scanner;
public class FizzBuzz { 
    // Method to find the FizzBuzz sequence
    public static String [] fizzBuzz(int n) {
        // Check if n is less than 0
        if(n<0){
            return null;
        }
        // Declare and initialize an array of Strings
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Declare and initialize a Scanner object
        Scanner sc = new Scanner(System.in);
        // Read the number 
        int n=sc.nextInt();
        String [] result = fizzBuzz(n);
        // Display the elements of the array
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }

    }    
}
