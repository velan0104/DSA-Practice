import java.util.Scanner;

public class AgnosticBS {
    static int agnosticSearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target ){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = end -1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] asc = {1,2,3,4,5,6,6,7,8,9,10};
        int[] desc = {10,9,8,7,6,6,5,4,3,2,1};
        System.out.println("Enter the number you want to search: ");
        int target = input.nextInt();
        System.out.println("For Ascending Order: ");
        if(agnosticSearch(asc, target) == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Elements found at index: " +  agnosticSearch(asc, target));
        }
        System.out.println("For descending Order");
        if(agnosticSearch(desc, target) == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + agnosticSearch(desc, target));
        }
    }
}
