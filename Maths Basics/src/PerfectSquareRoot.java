import java.util.Scanner;

public class PerfectSquareRoot {
    static double squareRoot(int num){
        int start = 0;
        int end = num;
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid * mid == num){
                return mid;
            }
            if(mid * mid > num){
                end = mid - 1;
            }else{
                start = mid + 1;
                // Root should be initialized to a floating-point value
                root = mid;
            }
        }
        double increment = 0.1;
        for(int i = 0; i<3; i++) {
            while (root * root <= num) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
    static double NRsqrt(int n){
        double x = n;
        double root;
        while(true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.25) {
                break;
            }
            x = root;

        }
        return root;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.printf( "%.3f",squareRoot(num));
        System.out.println(" ");
        System.out.printf("%.3f",NRsqrt(num));
    }
}
