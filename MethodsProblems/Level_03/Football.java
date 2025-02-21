import java.util.Random;
class Football{
      // Method to create an array of 11 players' heights with random values between 150 and 250 cm
      public static int[] generateHeights() {
          Random rand = new Random();
          int[] heights = new int[11]; // Array to store the heights of 11 players
          
          for (int i = 0; i < heights.length; i++) {
              heights[i] = rand.nextInt(101) + 150;  // Random height between 150 and 250 cm
          }
          
          return heights;
      }
  
      // Method to find the sum of all the elements in the heights array
      public static int calculateSum(int[] heights) {
          int sum = 0;
          
          for (int height : heights) {
              sum += height;
          }
          
          return sum;
      }
  
      // Method to find the mean height of the players
      public static double calculateMean(int[] heights) {
          int sum = calculateSum(heights);
          return (double) sum / heights.length; // Mean = sum of all heights / number of players
      }
  
      // Method to find the shortest height among the players
      public static int findShortestHeight(int[] heights) {
          int minHeight = heights[0];  // Assume the first height is the shortest
          
          for (int height : heights) {
              if (height < minHeight) {
                  minHeight = height;
              }
          }
          
          return minHeight;
      }
  
      // Method to find the tallest height among the players
      public static int findTallestHeight(int[] heights) {
          int maxHeight = heights[0];  // Assume the first height is the tallest
          
          for (int height : heights) {
              if (height > maxHeight) {
                  maxHeight = height;
              }
          }
          
          return maxHeight;
      }
  
      // Method to display the results
      public static void displayResults(int[] heights) {
          int sum = calculateSum(heights);
          double mean = calculateMean(heights);
          int shortest = findShortestHeight(heights);
          int tallest = findTallestHeight(heights);
          
          // Displaying the results
          System.out.println("Football Team Height Information:");
          System.out.println("----------------------------------");
          System.out.println("Heights of Players:");
          
          for (int height : heights) {
              System.out.print(height + " cm\t");
          }
          System.out.println();
          
          System.out.println("Sum of All Heights: " + sum + " cm");
          System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
          System.out.println("Shortest Height: " + shortest + " cm");
          System.out.println("Tallest Height: " + tallest + " cm");
      }
  
      public static void main(String[] args) {
          // Generate random heights for the football team
          int[] heights = generateHeights();
          
          // Display the results
          displayResults(heights);
      }
  }
  