class PalindromeChecker{
    public String text;
    PalindromeChecker(String text){
        this.text=text;
    }
    public boolean isPalindrome(){
        String updateText=text.replaceAll("\\s+", "").toLowerCase();
        for(int i=0; i<updateText.length(); i++){
            if(updateText.charAt(i)!=updateText.charAt(updateText.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public void display(){
        System.out.println(isPalindrome() ?"this text is palindrome ": "this is not a palindrom text");
    }
    public static void main(String[] args) {
        PalindromeChecker pc=new PalindromeChecker("race a Ecar");
        pc.display();

    }
}