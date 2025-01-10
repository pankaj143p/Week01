// Create IntOperation Class to perform integer operations
class IntOperation {
   
    public static void main(String[] args) {
 
       // Declare variables for a, b, and c
       int a = 5, b = 3, c = 7;
 
       // Perform operations considering operator precedence
       int result1 = a + b * c;
       int result2 = a * b + c;
       int result3 = c + a / b;
       int result4 = a % b + c;
 
       // Print the results of integer operations
       System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
    }
 }
 