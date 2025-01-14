import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class ArrayWords {
    // spit without split method 
    public static String[] split(String str){
        
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
        String [] words = new String [cnt+1];
        // ArrayList<String>words = new ArrayList<>();
        int i=0;
        int idx=0;
        String temp="";
        while (i<str.length()) {
            if(str.charAt(i)!=' '){
                temp+=str.charAt(i);
            }else{
                words[idx++]=temp;
                temp="";
                // idx++;
            }
            i++;
        }
        // words.add(temp);
        words[idx++]=temp;
        // words.add(temp);
        // String [] arr = new String[words.size()];
        // for(int j=0;j<words.size();j++){
        //     arr[j]=words.get(j);
        //     }
            return words;


    }
    // for length
    public static int len(String str){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
            cnt++;
            }
    }
    return cnt+1;

    }
    //display result 
    public static void display(String arr[][]){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for(String it[] : arr){
           for(int i=0; i<it.length; i++){
            System.out.print(it[i]+"\t");
           }
           System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=len(str);
        String ans[][]=new String[len][2];
        String arr[]=split(str);
        for(int i=0; i<arr.length; i++){
            int temp=arr[i].length();
            ans[i][0]=arr[i];
            ans[i][1]=String.valueOf(temp);
        }

       display(ans);
        // for(String it[] : ans){
        //     System.out.println(it[0]+" "+it[1]+"\t");
        // }


    }
}
