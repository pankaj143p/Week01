import java.util.Scanner;
class PrimeNumberSieve {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare the number variable to store the user input
        int number;       
        // Take input for the number
        System.out.print("Enter a number: ");
        number = sc.nextInt();       
        // Handle case when the number is less than 2
        if (number < 2) {
            System.out.println(number + " is not a prime number.");
            sc.close();
            return;
        }
        
        // Step 1: Create a boolean array to represent prime status
        boolean[] isPrime = new boolean[number + 1];
        
        // Step 2: Initialize all numbers as prime (true)
        for (int i = 0; i <= number; i++) {
            isPrime[i] = true;
        }       
        // Step 3: Sieve of Eratosthenes - Mark non-prime numbers
        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime
        
        // Loop through all numbers from 2 to sqrt(number)
        for (int i = 2; i * i <= number; i++) {
            if (isPrime[i]) { // If i is prime
                // Mark all multiples of i as non-prime
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Step 4: Check if the given number is prime
        if (isPrime[number]) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner stream
        sc.close();
    }
}