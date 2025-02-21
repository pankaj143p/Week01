import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation: 1. Add 2. Subtract 3. Multiply 4. Divide");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(num1, num2));
            case 2 -> System.out.println("Result: " + subtract(num1, num2));
            case 3 -> System.out.println("Result: " + multiply(num1, num2));
            case 4 -> System.out.println("Result: " + divide(num1, num2));
            default -> System.out.println("Invalid choice.");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return b != 0 ? a / b : Double.NaN;
    }
}
