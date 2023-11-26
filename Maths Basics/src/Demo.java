import java.util.ArrayList;

public class Demo {
    static int factor(int n, int k){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        int maxIndex = 1;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                list.add(i);
                maxIndex++;
            }
        }
        System.out.println(list);
        if(k  < list.size() && k <= list.get(maxIndex-1)){
            return list.get(k);
        }
        return -1;

    }

    public static void main(String[] args){
//        int n = 7;
//        int k = 2;
//        System.out.println(factor(n,k));
        String s = "1+1";
        System.out.println(Integer.valueOf(s));
    }
}
