import java.util.Scanner;
public class NumberFactor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); 
            int maxFactor = 10;
            int[] factors = new int[maxFactor];
            int index = 0; 
            // Find factors of the number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    if (index == maxFactor) {
                        maxFactor *= 2; 
                        // Double the array size if needed
                        int[] temp = new int[maxFactor];
                        System.arraycopy(factors, 0, temp, 0, factors.length);
                        factors = temp;
                    }
                    factors[index++] = i;
                }
            }
    
            // Display factors
            System.out.println("Factors of " + number + ":");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }
    
            sc.close();
        }
    }
    