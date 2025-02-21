import java.util.HashSet;
import java.util.Set;

public class OTP{
    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return 100000 + (int)(Math.random() * 900000);
    }
    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);  // If duplicate, Set will not add it
        }
        return otpSet.size() == otps.length;  
    }
    public static void main(String[] args) {
        int[] otps = new int[10];  // Array to hold 10 OTP numbers

        // Generate OTPs 10 times and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }
        // Check if the OTP numbers are unique
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}

