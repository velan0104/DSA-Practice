import java.util.Arrays;

public class Reverse2DArray {
    static void reverse(int[][] arr){
        for(int[] i:arr) {
            int start = 0;
            int end = i.length - 1;
            while(start < end){
                int temp = i[start];
                i[start] = i[end];
                i[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8}};
        reverse(arr);
        for(int[] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
