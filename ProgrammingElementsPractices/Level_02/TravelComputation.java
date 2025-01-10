import java.util.Scanner;
// Create TravelComputation Class to compute the Distance and Travel Time with user input
class TravelComputation {
   public static void main(String[] args) {
      // Create a Scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Get user inputs for name, cities, and distances
      System.out.print("Enter your name: ");
      // Read the name from the user
      String name = sc.nextLine();
      System.out.print("Enter fromCity: ");
      // Read the fromCity from the user
      String fromCity = sc.nextLine();
      System.out.print("Enter viaCity: ");
      // Read the viaCity from the user
      String viaCity = sc.nextLine();
      System.out.print("Enter toCity: ");
      // Read the toCity from the user
      String toCity = sc.nextLine();
      System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in km: ");
      // Read the distance from fromCity to viaCity from the user
      double distanceFromToVia = sc.nextDouble();
      System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in hours and minutes: ");
      //  Read the time taken from fromCity to viaCity from the user
      int hoursFromToVia = sc.nextInt();
      int minutesFromToVia = sc.nextInt();
      int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;
      System.out.print("Enter distance from " + viaCity + " to " + toCity + " in km: ");
      // Read the distance from viaCity to toCity from the user
      double distanceViaToFinalCity = sc.nextDouble();
      System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in hours and minutes: ");
      // Read the time taken from viaCity to toCity from the user
      int hoursViaToFinalCity = sc.nextInt();
      // Read the time taken from viaCity to toCity from the user
      int minutesViaToFinalCity = sc.nextInt();
      // Calculate total time
      int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;
      // Calculate total distance and total time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
      // Display the total distance and total time
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
   }
}
