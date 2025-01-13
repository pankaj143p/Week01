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
