import java.sql.SQLOutput;

public class recursion2 {
    static int[] printName(int count, int[] ans) {
        if (count == 0) {
            return ans;
        }
        count--;
        ans[count] = count + 1;
        printName(count, ans);
        return ans;
    }
        static long sumFirstN(long n) {
            if(n == 0){
                return 0;
            }
            n+= sumFirstN(n-1);
            return n;
        }
    public static void main(String[] args){
        System.out.println(sumFirstN(10000));

    }
}
