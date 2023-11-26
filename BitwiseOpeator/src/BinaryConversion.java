import java.util.Arrays;
import java.util.Scanner;

public class BinaryConversion {
//    static int binary(int num){
//        int n = num;
//        int binNum = 0;
//        while(n >= 1 ){
//            int rem = n % 2;
//            n = n/2;
//            binNum = (binNum * 10) + rem;
//        }
//        return binNum;
//
//    }
    static int count(int num){
        int cnt = 0;
        while(num > 0){
            cnt++;
            num &= (num-1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = new int[num + 1];
        for(int i = 0; i<=num; i++){
            ans[i] = count(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
