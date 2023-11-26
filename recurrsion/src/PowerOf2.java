public class PowerOf2 {
    static boolean power(int n,int start, int end){
        if(start>end){
            return false;
        }
        int mid = start + (end-start)/2;
        if(Math.pow(3,mid) == n){
            return true;
        }
        if(Math.pow(3,mid) > n){
            return power(n,start, mid - 1);
        }
        return power(n,mid + 1, end);
    }
    public static void main(String[] args) {
        int target = 0;
        System.out.println(power(target, 0, target/2));

    }
}
