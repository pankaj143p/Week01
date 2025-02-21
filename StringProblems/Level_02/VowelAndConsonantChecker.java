import java.util.Scanner;
public class VowelAndConsonantChecker{
    // method for convert to upper to lower character
    public static char toLowerCase(char c){
        if(c>='A'&&c<='Z')c=(char)(c+32);
        return c;
    }
    // method for find consonants and vowels
    public static String checkCharacterType(char c){
        c=toLowerCase(c);
        if(c>='a'&&c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return"Vowel";
            else return"Consonant";
        }
        return"Not a Letter";
    }
    // method for find consonants and vowels in a string
    public static String[][] findVowelsAndConsonants(String s){
        String[][] result=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            result[i][0]=String.valueOf(ch);
            result[i][1]=checkCharacterType(ch);
        }
        return result;
    }
    // method for print output
    public static void displayResult(String[][] result){
        System.out.println("Character\tType");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        String[][] result=findVowelsAndConsonants(str);
        displayResult(result);
    }
}
