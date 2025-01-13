import java.util.Scanner;
public class ConvertUpper {
        public static String toUpperCaseIfLower(String str){
            String temp="";
            for(int i=0; i<str.length(); i++){
                int ch=(int)str.charAt(i);
                if(ch>=97 && ch<=122){
                    ch=ch-32;
                }
                temp=temp+(char)ch;
                System.out.println((char)ch);
            }
            return temp;
        }
        // check string are eqaul or not using charAt method
        static boolean isEquals(String s1, String s2){
            if(s1.length() != s2.length()){
                return false;
            }
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str=sc.nextLine();
                String str1=toUpperCaseIfLower(str);
                String str2=str.toUpperCase();
                System.out.println(isEquals(str1,str2)?"Equals: " : "Not Equals");
        }
    }
    