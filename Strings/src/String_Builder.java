import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args){
        String demo = "Velan";
        System.out.println(demo.contains("a"));
        StringBuilder builder = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = input.nextLine();
        boolean ispalindrome = true;
        builder.append(name);
        System.out.println(builder);
        for(int i = 0; i<name.length(); i++){
            name = name.toLowerCase();
            int start = name.charAt(i);
            int end = name.charAt(name.length() - i - 1);
            if(start != end){
                ispalindrome = false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
        System.out.println(name.replaceAll("a","b"));
        String ip = "1.1.1.1";
        System.out.println(ip.replace(".","[.]"));
    }
}
