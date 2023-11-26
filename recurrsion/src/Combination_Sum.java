import java.util.ArrayList;
import java.util.List;
public class Combination_Sum {
    public static void main(String[] args) {
        int[] arr = {8,7,4,3};
        int target = 11;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        sum(arr,0,target,list,ans);
        System.out.println(list);
    }

    static void sum(int[] candidates,int index, int target,List<List<Integer>> ans, List<Integer> stack){
        if(index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(stack));
            }
            return;
        }
        if(candidates[index] <= target ){
            stack.add(candidates[index]);
            sum(candidates, index, target - candidates[index],ans,stack);
            stack.remove(stack.size() - 1);
        }
        sum(candidates,index + 1,target, ans,stack);
    }
}
