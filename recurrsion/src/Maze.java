import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Maze {
    public static void main(String[] args) {
//        ArrayList<String> ans = path("",3,3);
        Scanner input = new Scanner(System.in);
//        System.out.println(ans);
        ArrayList<ArrayList<Boolean>> arr = new ArrayList<>();
        for(int i = 0; i<3; i++){
            arr.add(new ArrayList<>());
            for(int j = 0; j < 3; j++){
                arr.get(i).add(input.nextBoolean());
            }
        }
        System.out.println(arr);
        ArrayList<String>ans = allPath("",arr,0,0);
        System.out.println(ans);
    }

    static ArrayList<String> path(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
             return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(path(p + "D", r-1,c-1));
        }
        if(r>1){
            list.addAll(path(p + "V", r-1,c));
        }
        if(c>1){
           list.addAll(path(p + "H",r, c-1));
        }
        return list;
    }

    static ArrayList<String> path(String p,ArrayList<ArrayList<Integer>> arr, int row, int column){
        if(row == arr.size()- 1 && column == arr.get(0).size() - 1 && arr.get(row).get(column) != 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row < arr.size() && column < arr.get(0).size() && arr.get(row).get(column) != 0){
            ans.addAll(path(p + "R", arr,row + 1, column));
        }
        if(row < arr.size() && column < arr.get(0).size() && arr.get(row).get(column) != 0){
            ans.addAll(path(p + "D", arr,row, column + 1));
        }
        return ans;
    }

    static ArrayList<String> allPath(String p, ArrayList<ArrayList<Boolean>> arr, int row, int column){
        if(row == arr.size() - 1 && column == arr.get(0).size() - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row < arr.size() - 1 ){
            arr.get(row).set(column,false);
            ans.addAll(allPath(p + "D", arr,row + 1, column));
//            arr.get(row).set(column,true);
        }
        if(column < arr.size() - 1 ){
            arr.get(row).set(column,false);
            ans.addAll(allPath(p + "R", arr, row , column + 1));
//            arr.get(row).set(column,true);
        }
        if(row > 0){
            arr.get(row).set(column,false);
            ans.addAll(allPath(p + "U", arr, row - 1, column));
//            arr.get(row).set(column,true);
        }
        if(column > 0){
            arr.get(row).set(column,false);
            ans.addAll(allPath(p + "L", arr, row, column - 1));
//            arr.get(row).set(column,true);
        }
        return ans;
    }
}
