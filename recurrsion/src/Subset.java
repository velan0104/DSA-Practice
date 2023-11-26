import java.util.List;
import java.util.ArrayList;
public class Subset {
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int size = outer.size();
            for(int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static double power(double x, int n){
        if(n == 0){
            return 1.0;
        }
        if(n == 1){
            return x;
        }
        if (n < 0){
            n = Math.abs(n);
            return 1/( x*power(x,n-1));
        }
        return x*power(x,n-1);

    }
    public static void main(String[] args){
        int[]arr ={1,2,3};
//        List<List<Integer>> ans = subset(arr);
//        for(List<Integer> list:ans ) {
//            System.out.println(list);
//        }
        System.out.println(power(0.00001,2147483647));

    }
}
