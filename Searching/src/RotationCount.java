public class RotationCount {
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    static int count(int[] arr, int start){
        int end = arr.length;
        int count = 0;
        for (int i = start; i<end; i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1};
        int pivot = findPivot(arr);
        System.out.println(pivot + 1);
        if(pivot == -1){
            System.out.println("Array is not rotated");
        }
        else{
            System.out.println(count(arr,pivot+1));
        }
    }
}
