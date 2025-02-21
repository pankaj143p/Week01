import java.util.Scanner;
public class LeapYear {
    // Method to check if a year is a leap year
    public boolean isLeapYear(int year) {
        if(year<1582){
            System.out.println("Invalue year");
            System.exit(0);
            return false;
        }
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // if(year<0){
        //     System.out.println("Invalid year");
        //     System.exit(0);
        //     return;
        // }
        // Creating an object of the class
        LeapYear obj = new LeapYear();
        // display the output
        if(obj.isLeapYear(year)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }

    }
}
