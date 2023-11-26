public class garbageCollection {
   public static void main(String[] args){
//       String[] garbage = {"G","P","GP","GG"};
//       int[] travel = {2,4,3};
       String[] garbage = {"MMM","PGM","GP"};
       int[] travel = {3,10};

       System.out.println("PaperCollection: " + paperCollection(garbage,travel));
   }
    static int paperCollection(String[] garbage, int[] travel){
        int n = garbage.length;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += 3 * travel[i];
        }
        for(String s: garbage){
            ans += s.length();
        }
        for(int i = n - 1; i > 0; i--){
            if(!garbage[i].contains("P")){
                ans -= travel[i - 1];
            }
            else{
                break;
            }
        }
        for(int i = n - 1; i > 0; i--){
            if(!garbage[i].contains("G")){
                ans -= travel[i - 1];
            }
            else{
                break;
            }
        }
        for(int i = n - 1; i > 0; i--){
            if(!garbage[i].contains("M")){
                ans -= travel[i - 1];
            }
            else{
                break;
            }
        }
        return ans;
    }

}

