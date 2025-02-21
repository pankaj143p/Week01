import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HandShakes {
    // Method to calculate the number of handshakes
    public int calculateHandShakes(int n){
        return n*(n-1)/2;
    }
    public static void main(String[] args) throws Exception{
        // bufferedReader object to take input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Taking input from user
        System.out.println("Enter the number of people: ");
        int n = Integer.parseInt(br.readLine());
        // Create an object of HandShakes class
        HandShakes hs = new HandShakes();
        // display calculating the number of handshakes
        System.out.println("The number of handshakes are: "+hs.calculateHandShakes(n));
    }
}
