import java.util.Scanner;
public class SmallestAndLargest {
    // Method to find the smallest number
    public static int [] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    } 
     public static void main(String[] args) {
        // SCanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        // Displaying the smallest and largest number
        int [] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is: "+result[0]+ " and the largest number is: "+result[1]);
     }
}