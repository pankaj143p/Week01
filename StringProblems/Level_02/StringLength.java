import java.util.*;
class StringLength{
    // method to find string length
    public static int findLength(String str){
        int i=0;
       try {
        while (str.charAt(i) != '\0') {
            i++;
            }
            // return i;
            } catch (StringIndexOutOfBoundsException e) {
            return i;
          }
         return 0;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Length of the string is: "+findLength(str));
        System.out.println(str.length());
    }
}