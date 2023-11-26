public class Main{
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            n *= factorial(n-1);
        }
        return n;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}