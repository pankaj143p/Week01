import java.util.Scanner;

        public class ShortandLongLength {
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
        // for finding longest and shortest word and length 
        public static String[][] minAndMaxWordLength(String arr[]){
            int min=(int)1e9;
            int max=-(int)1e9;
            String mnS="",mxS="";
            for(int i=0;i<arr.length;i++){
               if(arr[i].length()>max){
                max=arr[i].length();
                mxS=arr[i];
               }
               if(arr[i].length()<min){
                min=arr[i].length();
                mnS=arr[i];
               }
            }
               String res[][]=new String[2][2];
               res[0][0]=String.valueOf(min);
               res[1][0]=String.valueOf(max);
               res[0][1]=mnS;
               res[1][1]=mxS;


               return res;
        }
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str=sc.nextLine();
            int len=len(str);
            // int ans[]=new int[2];
            String arr[]=split(str);
            String[][] ans=new String[2][2];
            ans=minAndMaxWordLength(arr);
            // for(int i=0; i<arr.length; i++){
            //     lenArr[i]=(arr[i].length());
            // }
            ans=minAndMaxWordLength(arr);
            // System.out.println("Minimum length of words: "+ans[0]);
           
            for(String it[] : ans){
                System.out.println(it[0]+" "+it[1]+"\t");
            }
    
    
        }
    }
    
