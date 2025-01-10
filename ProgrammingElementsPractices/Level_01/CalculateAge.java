// for import Calendar from util package
import java.util.Calendar;
// create a class CalculateAge to find current age of Harry
class CalculateAge{ 
   public static void main(String args[]){ 
      // create a variable birthYear and assign value 2000
      int birthYear=2000;
      // use Calendar to find current dates 
      Calendar calendar=Calendar.getInstance();
      // to get current year
      int currentYear=calendar.get(Calendar.YEAR);
      System.out.println("Harry's age in "+currentYear+ " is "+  (currentYear-birthYear));
      }
    }
    
