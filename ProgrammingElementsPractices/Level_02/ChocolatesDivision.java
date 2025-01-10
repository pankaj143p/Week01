import java.util.Scanner;
// Create ChocolatesDivision Class to divide chocolates among children
class ChocolatesDivision {
   public static void main(String[] args) {
      // Create a Scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Get the number of chocolates and children from user
      System.out.print("Enter the number of chocolates: ");
      // Store the number of chocolates in a variable
      int numberOfChocolates = sc.nextInt();
      System.out.print("Enter the number of children: ");
      // Store the number of children in a variable
      int numberOfChildren = sc.nextInt();
      // Calculate the chocolates each child gets and the remaining chocolates
      int chocolatesPerChild = numberOfChocolates / numberOfChildren;
      int remainingChocolates = numberOfChocolates % numberOfChildren;
      // Display all the results 
      System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
   }
}
