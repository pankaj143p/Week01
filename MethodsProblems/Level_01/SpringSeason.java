public class SpringSeason {
    // Method to check if the given month and day are within the Spring season
    public static boolean isSpringSeason(String month, int day) {
        // Spring season starts on March 20 and ends on June 20
        // Convert the input month to lowercase for easier comparison
        month = month.toLowerCase();

        // Check if the month is between March and June
        if (month.equals("march")) {
            // March starts from the 20th
            return day >= 20;
        } else if (month.equals("april") || month.equals("may")) {
            // April and May are always within Spring season
            return true;
        } else if (month.equals("june")) {
            // June ends on the 20th
            return day <= 20;
        }
        // If the month is not in the range [March, June], it's not Spring
        return false;
    }

    public static void main(String[] args) {
        // Command line arguments should be passed for month (String) and day (int)
        if (args.length != 2) {
            System.out.println("Please provide both month (as a string) and day (as an integer) as command line arguments.");
            return;
        }

        // Parse the month and day from the command line arguments
        String month = args[0];
        int day;

        // Parse the day as an integer
        try {
            day = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for day! Please provide a valid integer for the day.");
            return;
        }
        // Check if it's spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
