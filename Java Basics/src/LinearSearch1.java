import java.util.Scanner;

public class LinearSearch1 {
    static int StringSearch(String str, char target){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (StringSearch(str,'a') == -1) System.out.println("Element not found");
        else System.out.println("Elements found at index: " + StringSearch(str,'a') );
    }
}
