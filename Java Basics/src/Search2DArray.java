import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
    static int search2D (int[][] arr2D, int target){
        for(int i = 0; i< arr2D.length;i++){
            for(int j = 0; j< arr2D.length; j++) {
                if(arr2D[i][j] == target) System.out.println("Elements found at index : " + i + "," + j );
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[][] arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};
        if(search2D(arr2D, target) ==  -1) System.out.println("Elements not found");
        else search2D(arr2D, target);
    }
}
