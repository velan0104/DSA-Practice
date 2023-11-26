import java.util.Scanner;

public class BinarySearch{
    static int binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target<arr[mid]){
                end = end -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,90,100, 150};
        System.out.println("Enter the number you want to search: ");
        int target = sc.nextInt();
        if(binSearch(arr,target) == -1) System.out.println("Elements not found");
        else System.out.println(binSearch(arr,target));
    }
}