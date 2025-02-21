import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date
        LocalDate inputDate = LocalDate.of(2023, 1, 1); // Example input date

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display the result
        System.out.println("Initial Date: " + inputDate);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + updatedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
