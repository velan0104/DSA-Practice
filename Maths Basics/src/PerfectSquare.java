import java.util.ArrayList;

public class PerfectSquare {
    static boolean perfectSquare(int num){
        int start = 0;
        int end = num;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 100;
        ArrayList <Integer> ans = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= num;  i++){
            if(perfectSquare(i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
        for(int i = ans.size() - 1; i >= 0; i--){
            for (Integer an : ans) {
                if (ans.get(i) + an == num) {
                    result.add(ans.get(i));
                    result.add(an);
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
