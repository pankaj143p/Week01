import java.util.Scanner;
class FactorsSumAndProduct {
    // Method to find the sum of factors of a number
    public int [] factors(int n) {
        int [] factors = new int[n];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[j] = i;
                j++;
            }
        }
        return factors;
    }
    // Method to find the product of factors of a number
    public int product(int n) {
        int [] factors = factors(n);
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] == 0) {
                break;
            }
            product *= factors[i];
        }
        return product;
    }

    // Method to find the sum of factors of a number
    public int sum(int n) {
        int [] factors = factors(n);
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] == 0) {
                break;
            }
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the sum of squars of factors of a number
 
    public int sumOfSquares(int n) {
        int [] factors = factors(n);
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] == 0) {
                break;
            }
            sum += Math.pow(factors[i],2);
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Creating an object of the class
        FactorsSumAndProduct obj = new FactorsSumAndProduct();
        // Calling the methods
        int [] factors = obj.factors(n);
        int product = obj.product(n);
        int sum = obj.sum(n);
        int sumOfSquares = obj.sumOfSquares(n);
        // Printing the results
        System.out.print("Factors of " + n + ": ");
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] == 0) {
                break;
            }
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println("Product of factors of " + n + ": " + product);
        System.out.println("Sum of factors of " + n + ": " + sum);
        System.out.println("Sum of squares of factors of " + n + ": " + sumOfSquares);
    }
}
