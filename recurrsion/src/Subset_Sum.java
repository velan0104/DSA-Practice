import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Subset_Sum {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        Arrays.sort(arr);
        ArrayList<Integer> sum = new ArrayList<>();
//        subsetSum(arr,0,0,sum);
//        Collections.sort(sum);
//        System.out.println(sum);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        subset(arr,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void subsetSum(int[] arr, int index, int sum, ArrayList<Integer> list){
        if(index == arr.length){
            list.add(sum);
            return;
        }
        subsetSum(arr, index + 1, sum + arr[index],list);
        subsetSum(arr,index + 1, sum,list);
    }

    static void subset(int[] arr, int index, ArrayList<Integer>list, ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for (int i = index; i < arr.length ; i++) {
            if (i != index && arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
            subset(arr,i + 1, list,ans);
            list.remove(list.size() - 1);
        }
    }
}
