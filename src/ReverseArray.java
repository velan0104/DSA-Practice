public class ReverseArray {
    static void reverse(int[] arr, int start, int end){
        if(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println("Before Reversing:");
        for(int value: arr){
            System.out.println(value);
        }
        reverse(arr,0,arr.length - 1);
        System.out.println("After Reversing:");
        for(int value: arr){
            System.out.println(value);
        }
    }
}
