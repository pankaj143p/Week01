import java.util.Scanner; 
public class ArrayBound{ 
    public static void generateArrayIndexOutOfBoundsException(String[] names, int index) { 
        System.out.println("Accessing element at index " + index + ": " + names[index]); 
    } 
    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) { 
        try { 
            generateArrayIndexOutOfBoundsException(names, index); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index " + index + " is out of bounds."); 
        } catch (RuntimeException e) { 
            System.out.println("Caught a runtime exception: " + e.getMessage()); 
        } 
    } 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"}; 
        System.out.println("Enter an index to access an element from the array:"); 
        int index = sc.nextInt(); 
        try { 
            generateArrayIndexOutOfBoundsException(names, index); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Caught ArrayIndexOutOfBoundsException in main: " + e.getMessage()); 
        } 
        System.out.println("Handling the exception..."); 
        handleArrayIndexOutOfBoundsException(names, index); 
        sc.close(); 
    } 
}
