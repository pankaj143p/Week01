import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = getInput("Enter the first number: ");
        int b = getInput("Enter the second number: ");
        int c = getInput("Enter the third number: ");
        int max = findMax(a, b, c);

        System.out.println("The maximum of the three numbers is: " + max);
    }

    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
