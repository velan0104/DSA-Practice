import java.util.Scanner;
import java.util.Arrays;
public class Patterns {
    static void upperTriangle(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            System.out.print("*");
            upperTriangle(row,++column);
        }
        else{
            System.out.println();
            upperTriangle(--row,0);
        }
    }

    static void lowerTriangle(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            lowerTriangle(row,++column);
            System.out.print("*");
        }
        else{
            lowerTriangle(--row,0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr,int n,int start){
        if(n == 0){
            return;
        }
        if(start < n){
            if(arr[start] > arr[start + 1]){
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
                bubbleSort(arr,n,start + 1);
        }else {
            bubbleSort(arr, n - 1, 0);
        }
    }

    static void selectionSort(int[] arr, int start, int end, int max){
        if(end == 0){
            return;
        }
        if(start <= end) {
            if (arr[start] > arr[max]) {
                max = start;
            }
            selectionSort(arr,start + 1, end,max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
            selectionSort(arr, 1,end - 1,0);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of lines: ");
//        int row = input.nextInt();
//        upperTriangle(row,0);
//        lowerTriangle(row,0);
        int[] arr ={3,3,3,2,1,3};
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr,arr.length - 1,0 );
        selectionSort(arr,1, arr.length - 1,0);
        System.out.println(Arrays.toString(arr));

    }
}
