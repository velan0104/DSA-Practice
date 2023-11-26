import java.util.ArrayList;

public class Arrays {
    static boolean sorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
    }
    static int linearSearch(int[] arr, int target,int index){
        if (index == arr.length - 1 && arr[index] != target){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr,target,index + 1);
    }
    static ArrayList allOccurences(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index > arr.length - 1 ){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return allOccurences(arr,target, index + 1, list);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr ={1,2,3,1,1};
//        System.out.println(sorted(arr,0));
//        System.out.println(linearSearch(arr,0,0));
        System.out.println(allOccurences(arr,1,0,list));
    }
}
