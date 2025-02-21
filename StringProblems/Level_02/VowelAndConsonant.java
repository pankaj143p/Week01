import java.util.Scanner;
public class VowelAndConsonant{
    // method to change upper to lower character 
    public static char cL(char c){
        if(c>='A'&&c<='Z')c=(char)(c+32);
        return c;
    }
    // method for find vowels and consonants
    public static String cT(char c){
        c=cL(c);
        if(c>='a'&&c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return"V";
            else return"C";
        }
        return"N";
    }
    // method for count consonant and vowels 
    public static int[] fVandC(String s){
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(cT(ch).equals("V"))v++;
            else if(cT(ch).equals("C"))c++;
        }
        return new int[]{v,c};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] r=fVandC(str);
        System.out.println("Vowels counts are : "+r[0]);
        System.out.println("Consonant counts are : "+r[1]);
    }
}