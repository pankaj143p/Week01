import java.util.Scanner;
public class temp {
    // public class StringToArray {
        // method to convert string to char array
        public static char[] StringToArray(String str){
           return str.toCharArray();
        }
        // method to convert string to char array without inbuild method
        public static char[] StringToArrayWithoutInbuildMethod(String str){
            char []charArray=new char[str.length()];
            for(int i=0; i<str.length(); i++){
                charArray[i]=str.charAt(i);
            }
            return charArray;
        }
        // method to check arrays are equal or not
        public static boolean checkArrays(char arr1[], char arr2[]) {
            int i=0;
            if(arr1.length!=arr2.length)return false;
            while(i<arr1.length){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
                i++;
            }
            return true;
         }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.next();
            // System.out.println(str);
            char chaArr1[]=StringToArray(str);
            char chaArr2[]=StringToArrayWithoutInbuildMethod(str);
            System.out.println((checkArrays(chaArr1,chaArr2)) ? "both are equals " : "not equals");

            // System.out.println("lengths--> "+chaArr1.length+"  "+chaArr2.length);
        }
    }
    