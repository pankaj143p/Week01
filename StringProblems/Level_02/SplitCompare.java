import java.util.Scanner;

public class SplitCompare {
    // method find length of string
    public static int findLength(String str){
        int i=0;
        try {
            while(str.charAt(i) != '\0'){
                i++;
            }
            // return i;
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
        return 0;
    }
    // method to count lenght for array 
    public static int cnt(String str) {
        int cnt = 0;
        for(int i=0; i<findLength(str); i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
        return cnt+1;
    }

    // split the string 
    public static String[] splitString(String str){
        int n=findLength(str);
        String[] arr=new String[cnt(str)];
        String temp="";
        int idx=0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)!=' '){
                temp+=str.charAt(i);
            }else{
                arr[idx++]=temp;
                temp="";
            }
            if(!temp.isEmpty())
            arr[idx]=temp;
        }
        return arr;

    }
    public static boolean compare(String arr1[], String arr2[]){
        if(arr1.length!=arr2.length)return false;
        //   int i=0;
        //   while(i<arr1.length){
        //     if(!(arr1[i].equals(arr2[i]))){
        //         return false;
                
        //     }
        //     i++;
        // }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=splitString(str);
        System.out.println(compare(arr, str.split(" "))? "both are eqauls: ":"not equals");
    }
}
