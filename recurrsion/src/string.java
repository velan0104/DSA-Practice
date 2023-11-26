import java.util.ArrayList;
import java.util.List;

public class string {
    public static void main(String[] args) {
        String str = "abc";
        String p = "";
//        System.out.println(removeA(str));
//        System.out.println(subsequence(ans,str));
        String digits = "23";
        String[] arr = {"","", "abc","def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        combination(digits, ans, arr, 0, "", "");
        System.out.println(ans);
    }

    static void skipA(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skipA(ans,str.substring(1));
        }else{
            skipA(ans + ch,str.substring(1));
        }
    }
    static String removeA(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return removeA(str.substring(1));
        }else{
            return ch + removeA(str.substring(1));
        }
    }

    static ArrayList<String> subsequence(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence(p + ch,up.substring(1));
        System.out.println(left);
        ArrayList<String> right = subsequence(p, up.substring(1));
        System.out.println(right);
        left.addAll(right);
        return left;
    }

    static void combination(String digits, List<String> ans, String[] arr, int index, String p,String up){
        if(index == digits.length()){
            ans.add(p);
            p = "";
            return;
        }
        int number = digits.charAt(index) - '0';
        up = arr[number];
        for(int i = 0; i < arr[number].length(); i++){
            p += up.charAt(i);
            combination(digits,ans, arr, index + 1, p,up.substring(1));
        }
    }

}
