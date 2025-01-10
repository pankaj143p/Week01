package Level_03;
import java.util.Scanner;
// Create a class DayOfWeek it's purpose is to find the day of the week for a given date
class DayOfWeek {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Get input values for month, day, and year
      System.out.print("Enter month (1-12): ");
      // Take user input for the month
      int m = sc.nextInt();
      System.out.print("Enter day: ");
      // Take user input for the day
      int d = sc.nextInt();
      System.out.print("Enter year: ");
      // Take user input for the year
      int y = sc.nextInt();
      // Applying the Zeller's congruence algorithm
      int y0 = y - (14 - m) / 12;
      int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
      int m0 = m + 12 * ((14 - m) / 12) - 2;
      int d0 = (d + x + 31 * m0 / 12) % 7;

      // Output the day of the week
      System.out.println("The day of the week is: " + d0);
   }
}
