public class isPalindrome {
    static boolean palindrome(String s){
        int start = 0;
        int end = s.length() -1;
        if(s.length() <=1){
            return true;
        }
        else if(s.charAt(start) == s.charAt(end)){
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[]args){
        String s = "A man, a plan, a canal: Panama";
        if(palindrome(s)){
            System.out.println("The given string is Palindrome");
        }
        else
            System.out.println("The given string is not palindrome");

    }
}
