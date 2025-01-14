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
        public static int[] minAndMaxWordLength(String arr[]){
            int min=arr[0].length();
            int max=arr[0].length();
            for(int i=1;i<arr.length;i++){
               if(arr[i].length()>max){
                max=arr[i].length();
               }
               if(arr[i].length()<min){
                min=arr[i].length();
               }
            }
               int res[]=new int[2];
               res[0]=min;
               res[1]=max;

               return res;
        }
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str=sc.nextLine();
            int len=len(str);
            int ans[]=new int[2];
            String arr[]=split(str);
            int lenArr[]=new int[arr.length];
            for(int i=0; i<arr.length; i++){
                lenArr[i]=String.(arr[i].length());
            }
          
            // for(String it[] : ans){
            //     System.out.println(it[0]+" "+it[1]+"\t");
            // }
    
    
        }
    }
    
