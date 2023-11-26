import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    static boolean isOdd(int n){
        return( (n&1) == 1);
    }
    static int findDuplicates(int[] arr){
        int unique = 0;
        for(int i: arr) {
            unique ^= i;
        }
        return unique;
    }

    static int[] decode(int[] encoded, int first){
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for(int i = 0; i< encoded.length; i++){
            first = encoded[i] ^ first;
            if(i <= encoded.length - 1) {
                ans[i+1] = first;
            }
        }
        return ans;
    }

    static int getXorSum(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length * arr2.length];
        int count = 0;
        for(int i = 0 ; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                ans[count] = arr1[i] & arr2[j];
                count++;
            }
        }
        int result = 0;
        for(int i: ans){
            result ^= i;
        }
        return result;
    }
    public static void main(String[] args){
//        Q1. Find whether the number is even or odd
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        if(isOdd(num)){
//            System.out.println("Number is odd");
//        }
//        else{
//            System.out.println("Number is even");
//        }

        
//        Q2. Find the duplicates number from the array
//        int[] arr = {2,3,1,2,1,3,4};
//        System.out.println("Duplicate number from the array is: " + (findDuplicates(arr)));

        for(int i = 1; i<=10; i++){
            System.out.println(i + " : " + (i^i-1));
        }
    }
}
