/*
 * Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

 */
import java.util.*;
public class BoundsException {
    public static void generateStringIndexOutOfBoundsException(String str){
       System.out.println(str.charAt(str.length()));
    }
    public static void handleStringIndexOutOfBoundsException(String str){
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught in method");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        try {
            generateStringIndexOutOfBoundsException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception catch");      
        }
        System.out.println("the exception is catched");
        handleStringIndexOutOfBoundsException(str);


        
    }
}
