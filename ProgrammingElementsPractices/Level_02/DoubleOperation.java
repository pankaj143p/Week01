// Create DoubleOpt Class to perform double operations
class DoubleOperation{
   
    public static void main(String[] args) {
       // Declare variables for a, b, and c
       double a=5.5, b=3.3, c=7.7;
       // Perform operations considering operator precedence
       double result1=a+b*c;
       double result2=a*b+c;
       double result3=c+a/b;
       double result4=a%b+c;
 
       // Display the results of double operations
       System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
    }
 }
 