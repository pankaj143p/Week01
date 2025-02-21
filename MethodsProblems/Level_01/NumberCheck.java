import java.io.BufferedReader;
import java.io.InputStreamReader;
public class NumberCheck {
    // Method to check if the number is positive, negative or zero
    public int checkNumber(int number){
        if(number>0){
            return 1;
        }
        else if(number<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) throws Exception{
        // bufferedReader object to take input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Taking input from user
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(br.readLine());
        // Create an object of NumberCheck class
        NumberCheck nc = new NumberCheck();
        // display checking the number
        int result = nc.checkNumber(number);
        if(result==1){
            System.out.println("The number is positive");
        }
        else if(result==-1){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
        
    }
}
