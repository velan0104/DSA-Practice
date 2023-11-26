import java.util.Scanner;
import java.util.Arrays;
public class Search2D {
    static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int column = arr[0].length -1;
        while(row < arr.length -1 && column >=0){
            if(arr[row][column] == target){
                return new int[]{row,column};
            }
            else if(arr[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 2,3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Enter the number: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(binarySearch(arr,target )));
    }
}
