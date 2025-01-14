import java.util.Scanner;

public class StringTrim{

    // Method to trim leading and trailing spaces from a string using charAt()
    public static int[] trimSpaces(String s){
        int start=0,end=s.length()-1;
        
        // Find the first non-space character
        while(start<=end&&s.charAt(start)==' '){
            start++;
        }
        
        // Find the last non-space character
        while(end>=start&&s.charAt(end)==' '){
            end--;
        }
        
        return new int[]{start,end};
    }

    // Method to create a substring from a string using charAt(), start, and end indices
    public static String getSubstring(String s,int start,int end){
        StringBuilder result=new StringBuilder();
        for(int i=start;i<=end;i++){
            result.append(s.charAt(i)); 
        }
        return result.toString(); 
    }

    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false; 
        }
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input=sc.nextLine();

        int[] indices=trimSpaces(input);
        String trimmedUsingCharAt=getSubstring(input,indices[0],indices[1]);

        String trimmedUsingBuiltIn=input.trim();

        boolean areEqual=compareStrings(trimmedUsingCharAt,trimmedUsingBuiltIn);

        // Display the results
        System.out.println("Trimmed using charAt() method: '"+trimmedUsingCharAt+"'");
        System.out.println("Trimmed using built-in trim() method: '"+trimmedUsingBuiltIn+"'");
        System.out.println("Are the two trimmed strings equal? "+areEqual);
    }
}

