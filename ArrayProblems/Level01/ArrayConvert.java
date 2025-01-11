import java.util.Scanner;

public class ArrayConvert {
    public static void main(String[] args) {
        // Declare and initialize a Scanner object
        Scanner sc = new Scanner(System.in);
        // Read the number of rows and columns
        int n=sc.nextInt();
        int m=sc.nextInt();
        // Declare and initialize an array of integers
        int mat [][] = new int[n][m];
        // Read the elements of the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int [] arr = new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k]=mat[i][j];
                k++;
            }
        }
        // Display the elements of the array
        for(int i=0;i<n*m;i++){
            System.out.print(arr[i]+" ");
        }
        // Close the Scanner object
        sc.close();
    }
}
