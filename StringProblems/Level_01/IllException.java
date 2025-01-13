import java.util.*;

public class IllException {
    public static void generateIllegalArgumentException(String str, int start, int end) {
        // Validate indices first
        if (start < 0 || end > str.length() || start > end) {
            throw new StringIndexOutOfBoundsException("Invalid indices");
        }
        System.out.println(str.substring(start, end));
    }

    public static void handleIllegalArgumentException(String str, int start, int end) {
        try {
            generateIllegalArgumentException(str, start, end);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught in method: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();

        try {
            generateIllegalArgumentException(str, start, end);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Handling exception in handleIllegalArgumentException:");
        handleIllegalArgumentException(str, start, end);
    }
}
