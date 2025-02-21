import java.util.Arrays;

public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; 
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; 
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];  
    }

    // Method to find the sum of the factors using the factors array and return the sum
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return the product
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array and return the product
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);  // Cube the factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int i = 0; i < factors.length - 1; i++) {  
            sum += factors[i];
        }
        return sum == number;  // A perfect number is equal to the sum of its proper divisors
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int i = 0; i < factors.length - 1; i++) {  
            sum += factors[i];
        }
        return sum > number;  // An abundant number has a sum of divisors greater than the number
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int i = 0; i < factors.length - 1; i++) {  
            sum += factors[i];
        }
        return sum < number;  // A deficient number has a sum of divisors less than the number
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);  // Add the factorial of each digit
            temp /= 10;
        }
        return sum == number;  // A strong number is equal to the sum of the factorials of its digits
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;  // Factorial of 0 or 1 is 1
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Sample number to check
        String numberInput = System.console().readLine("Enter a number: ");
        int number = Integer.parseInt(numberInput);

        // Find the factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        // Find the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor of " + number + ": " + greatestFactor);

        // Find the sum of the factors
        int sumFactors = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sumFactors);

        // Find the product of the factors
        int productFactors = productOfFactors(factors);
        System.out.println("Product of factors: " + productFactors);

        // Find the product of cubes of the factors
        double productCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of the factors: " + productCubes);

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is the number a perfect number? " + (isPerfect ? "Yes" : "No"));

        // Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is the number an abundant number? " + (isAbundant ? "Yes" : "No"));

        // Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is the number a deficient number? " + (isDeficient ? "Yes" : "No"));

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is the number a strong number? " + (isStrong ? "Yes" : "No"));
    }
}

