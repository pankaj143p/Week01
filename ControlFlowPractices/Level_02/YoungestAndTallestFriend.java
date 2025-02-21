import java.util.Scanner;

class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables to store age and height for 3 friends
        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;
        
        // Take input for ages
        System.out.print("Enter age of Amar: ");
        ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        ageAnthony = sc.nextInt();
        
        // Take input for heights
        System.out.print("Enter height of Amar (in cm): ");
        heightAmar = sc.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        heightAkbar = sc.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        heightAnthony = sc.nextDouble();
        
        // Find the youngest friend by checking the smallest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend by checking the largest height
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");
        
        // Close the scanner stream
        sc.close();
    }
}