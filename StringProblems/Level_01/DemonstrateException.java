import java.util.Scanner;

public class DemonstrateException {
    // generate exception
    public static void generateNullPointerException(){
        String str=null;
        System.out.println(str.length());
    }
    // handle exception
    public static void handleNullPointerException(){
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("NullPointerException caught");
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=null;
        // try catch for handle exception
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
        System.out.println("ab kyu chal tha hai ye: ");
        handleNullPointerException();
    }
}
