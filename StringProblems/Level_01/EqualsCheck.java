import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EqualsCheck{
    // check string are eqaul or not using charAt method
    boolean isEquals(String s1, String s2){
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
    // check string are eqaul or not using equals method
    boolean isEqualsUsingEqualsMethod(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();

        String s2=br.readLine();
        EqualsCheck ec = new EqualsCheck();

        // display the results
        System.out.println("String are equal or not using charAt method: "+ec.isEquals(s1,s2));
        System.out.println("String are equal or not using equals method: "+ec.isEqualsUsingEqualsMethod(s1,s2));

    }
}

