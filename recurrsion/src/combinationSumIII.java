import java.util.ArrayList;
import java.util.Arrays;

public class combinationSumIII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 4;
        int n = 1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combination(arr,k,n,0,new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void combination(int[] arr, int count,int target, int index, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if( count == 0 && target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index;i<arr.length; i++){
            if(i > index) continue;
            if(arr[i] > target) break;
            list.add(arr[i]);
            combination(arr,count - 1, target - arr[i],i + 1,list,ans);
            list.remove(list.size() - 1);
            combination(arr,count, target,i + 1,list, ans);
        }
    }
}
