import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        int[] multiplicationTable = new int[10];
        // Calculate multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        sc.close();
    }
}
