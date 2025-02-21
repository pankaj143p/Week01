import java.util.Scanner;
public class Calendar{
    // Pair class to hold month and year
    public static class MonthYear {
        int month;
        int year;

        // Constructor to initialize the month and year
        public MonthYear(int month, int year) {
            this.month = month;
            this.year = year;
        }

        // Getter for month
        public int getMonth() {
            return this.month;
        }

        // Getter for year
        public int getYear() {
            return this.year;
        }
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; 
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return (year % 400 == 0);  
            }
            return true;  
        }
        return false;  
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        // Days in each month (ignoring February for now)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // If February, check if it's a leap year
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }

        return daysInMonth[month - 1];  
    }

    // Method to get the first day of the month using the Gregorian Calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        // Gregorian Calendar formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; 

        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(MonthYear monthYear) {
        // Get the month and year from the pair object
        int month = monthYear.getMonth();
        int year = monthYear.getYear();

        // Get the month name
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        
        // Get the first day of the month (0=Sunday, 6=Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar header
        System.out.printf("\n%s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); 
            }
        }

        System.out.println(); 
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take month and year as input

        int month = sc.nextInt();
        int year = sc.nextInt();

        // Create a MonthYear object to hold the month and year
        MonthYear monthYear = new MonthYear(month, year);

        // Display the calendar
        displayCalendar(monthYear);
    }
}
