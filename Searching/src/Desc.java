import java.util.Scanner;

public class Desc {
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end -start)/2;
        if (arr[start] < target){
            return -1;
        }
        while(start<=end){
            mid = start + (end -start)/2;
            if(arr[mid] > target){
                start = mid + 1;
            }
            else if(arr[mid] < target){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[mid-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr ={200,150,120,90,78,45,24};
        System.out.println("Enter the element you want to search: ");
        int target = sc.nextInt();
        if(ceiling(arr, target) == -1){
            System.out.println("Ceiling of the given element is not present in the array");
        }
        else {
            System.out.println("Ceiling of the " + target + " is: " + ceiling(arr, target));
        }
    }
}
