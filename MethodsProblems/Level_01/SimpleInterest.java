import java.io.BufferedReader;
import java.io.InputStreamReader;
class SimpleInterest{
    // Method to calculate Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time){
        return (principal*rate*time)/100;
    }
    public static void main(String[] args) throws Exception{
        // Create an object of SimpleInterest class
        SimpleInterest si = new SimpleInterest();
        // Creating BufferedReader object to take input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Taking input from user
        System.out.println("Enter the principal amount: ");
        double principal = Double.parseDouble(br.readLine());
        System.out.println("Enter the rate of interest: ");
        double rate = Double.parseDouble(br.readLine());
        System.out.println("Enter the time period: ");
        double time = Double.parseDouble(br.readLine());
        // displaying the result 
        System.out.println("The Simple Interest is" +si.calculateSimpleInterest(principal,rate,time)+ " for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
}

