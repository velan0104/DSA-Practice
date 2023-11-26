import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int[] hash = new int[26];
        for (int i = 0; i< s.length(); i++){
            hash[s.charAt(i) - 'a'] += 1;
        }
        String counter = sc.next();
        for(int i = 0; i<counter.length(); i++){
            System.out.println(hash[s.charAt(i) - 'a']);
        }



    }
}
