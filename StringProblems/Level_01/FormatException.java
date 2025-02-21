import java.util.Scanner;
public class FormatException {  
        // Method to generate NumberFormatException
        public static void generateNumberFormatException(String str) {
            int number = Integer.parseInt(str);
            System.out.println("Parsed number: " + number);
        }
    
        // Method to handle NumberFormatException
        public static void handleNumberFormatException(String str) {
            try {
                generateNumberFormatException(str);
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException catched");
            } catch (RuntimeException e) {
                System.out.println("Caught a runtime exception: " + e.getMessage());
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter a string to convert to an integer:");
            String str = sc.nextLine();

            try {
                generateNumberFormatException(str);
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException in main: Invalid input.");
            }
            System.out.println("Handling the exception");
            handleNumberFormatException(str);
            
            sc.close();
        }
    }
    