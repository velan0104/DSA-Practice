import java.util.Arrays;
public class Sort {
//    Bubble Sort
    static void bubbleSort(int[] arr){
        int length = arr.length;
        boolean swapped;
        for(int i = 0; i<length; i++){
            swapped = false;
            for(int j = 1; j < length - i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
//  Selection Sort
    static int max(int[] arr,int start, int end){
        int max = start;
        for(int j = 0; j <= end; j++){
            if(arr[max] < arr[j]){
                max = j;
            }
        }
        return max;
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int end = arr.length - i - 1;
            int max = max(arr,0,end);
            swap(arr,max,end);
        }
    }

//    Insertion Sort

    static void insertionSort(int[] arr){
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
//    Cyclic Sort
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length - 1){
            int correct = i+1;
            if(arr[i] != correct){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }


    public static void main(String[] args){
        int[] arr= {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
