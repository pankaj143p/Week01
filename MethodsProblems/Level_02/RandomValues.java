import java.util.Random;
public class RandomValues{
    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        // Generate random 4-digit numbers between 1000 and 9999
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000);  // 1000 to 9999
        }
        return numbers;
    }
    // Method to find the average, minimum, and maximum value in an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];   
        // Iterate through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num); 
            max = Math.max(max, num);
        }
        // Calculate the average
        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }
    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        // Find the average, minimum, and maximum values
        double[] results = findAverageMinMax(randomNumbers);
        // Output the results
        System.out.println("Random 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        // Display the result 
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}

