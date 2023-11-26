import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static void main(String[] args){
        String str = "prosperity";
        String random = "properties";
//        ArrayList<String> result = permutation("",str);
//        for(String i: result){
//            if(check(random,i)) {
//                System.out.println("True");
//                break;
//            }
//            else check(random,i);
//        }
//        System.out.println(result.size());
//        List<String>list = helper("", "123");
//        System.out.println(list);
        Sum("", 4);
    }


    static boolean check(String str1, String str2){
        if(str1.isEmpty()){
            return false;
        }
        if(str1.startsWith(str2)){
            return true;
        }
            return check(str1.substring(1), str2);
    }
//    static void permutations(int p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        for(int i =0; i<= p.length(); i++){
//            String first = p.substring(0,i);
//            String second = p.substring(i,p.length());
//            permutations(first + ch + second, up.substring(1));
//        }
//    }

    static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> outer = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
           outer.addAll(permutation(first+ch+second, up.substring(1)));
        }
        return outer;
    }

    static  List<String> helper(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1) * 3; i < digit * 3; i++ ){
            char ch = (char)('a' + i);
            ans.addAll(helper(p + ch,up.substring(1)));
        }
        return ans;
    }

    static void Sum(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 0; i <=6 && target <= i; i++){
            Sum(p+i, target - i);
        }
    }
}
