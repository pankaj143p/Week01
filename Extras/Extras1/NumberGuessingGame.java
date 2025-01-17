import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100.");
        while (!found) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                found = true;
                System.out.println("Yay! I guessed your number: " + guess);
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        scanner.close();
    }

    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}
