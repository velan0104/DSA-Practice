import javax.crypto.spec.PSource;

public class Demo {
    static void reversePrint(int num){
        if(num == 0)
            return;
        reversePrint(num-1);
        System.out.println(num);
    }
    static void print(int num){
        if(num == 0)
            return;
        System.out.println(num);
        print(num-1);
    }
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
    static int sumOfDigits(int num){
        if(num == 0){
            return 0;
        }
        return (num%10) + sumOfDigits(num/10);

    }
    static int ans = 0;
    static void reverse (int num){
        if (num == 0){
            return;
        }
        int rem = num %10;
        ans = (ans * 10 ) + rem;
        reverse(num/10);
    }
    static int countZeros(int num) {
        return helper(0,num);
    }
    static int helper(int count, int num){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            return helper(++count,num/10);
        }
        return helper(count,num/10);
    }
    public static void main(String[] args) {
        int num = 5;
//        print(5);
//        reversePrint(5);
//        System.out.println(factorial(15));
//        System.out.println(sumOfDigits(52345));
//        reverse(351234);
//        System.out.println(ans);
        System.out.println(countZeros(503005));
    }
}
