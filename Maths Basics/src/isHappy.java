public class isHappy {
    static int squareBits(int num){
        int ans = 0;
        while(num != 0){
            int rem = num%10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
    static boolean isHappy(int n) {
        int ans = n;
        int count = 0;
        while(ans >= 1 && count < 10){
            if(ans == 1){
                return true;
            }
            else{
                ans = squareBits(ans);
                count++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println(isHappy(num));
    }
}
