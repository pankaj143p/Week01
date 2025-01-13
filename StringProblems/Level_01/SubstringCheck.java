import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubstringCheck {
    // method to find the substring with out using any inbuild method
    public static String getSubString(String str, int s, int e){
        String subString="";
        if(e>str.length() || s<0){
            return "invalide range";
        }
        for(int i=0; i<str.length(); i++){
            if(i>=s && i<e){
                subString+=str.charAt(i);
            }
        }
        return subString;
    }

    // method to find substring using inbuild method
    public static String getSubStringUsingsubstring(String str, int s, int e){
        return str.substring(s, e);
    } 
    // method to check substrings are equal or not 
    public static boolean checkStrings(String s1, String s2){
        return s1.equals(s2);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int start=Integer.parseInt(br.readLine());
        int end=Integer.parseInt(br.readLine());
        String subString1=getSubString(str, start, end);
        String subString2=getSubStringUsingsubstring(str, start, end);
        System.out.println(checkStrings(subString1, subString2) ? "both are equals" : "not equals");
        
    }
}
