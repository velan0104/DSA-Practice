import java.util.Scanner;

public class Fibonacci_Series {
    static int fib(int n){
        if (n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
