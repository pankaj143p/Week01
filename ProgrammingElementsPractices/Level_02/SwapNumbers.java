// Create SwapNumbers Class to swap two numbers
class SwapNumbers {
   
    public static void main(String[] args) {
       // Declare variables for number1 and number2
       int number1 = 5, number2=10;
 
      number1 = number1^number2;
      number2 = number1^number2;
      number1 = number1^number2;
       // display the swapped numbers
       System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
 }
 