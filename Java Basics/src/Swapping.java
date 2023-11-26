import java.util.Arrays;

public class Swapping {
    static int[]  swap (int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = {a,b};
        System.out.println(a+ " " +b);

        System.out.println(Arrays.toString(swap(arr)));
    }
}
