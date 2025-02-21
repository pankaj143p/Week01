import java.util.Scanner;
public class TableSixToNine {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to print its multiplication table (6-9): ");
            int number = sc.nextInt();
            if(number >= 6 && number <= 9) {
                System.out.println("Multiplication Table for " + number + ":");
                int[] multiplicationResult = new int[10];
                // Calculate multiplication table
                for (int i = 1; i <= 10; i++) {
                    multiplicationResult[i - 1] = number * i;
                    System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
                }
            }
    
            sc.close();
        }
    }
    
