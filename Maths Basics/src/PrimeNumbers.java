import java.util.Scanner;

public class PrimeNumbers {
    static void seive(boolean[] arr, int num){
        for(int i = 2; i * i <=num; i++){
            if(!arr[i] ){
                for (int j = i * 2; j <= num; j += i) {
                    arr[j] = true;
                }
            }
        }
        for(int i = 0; i<=num; i++){
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        boolean[] valid = new boolean[num+1];
        seive(valid,num);
    }
}
