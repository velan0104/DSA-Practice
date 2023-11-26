import java.util.ArrayList;

public class Rat_In_A_Maze {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,0,0},
                {1,1,0,0},
                {0,1,1,1}
        };
        int n = 4;
        System.out.println(steps(maze, 0, 0, n - 1, ""));
        System.out.println(ans);
    }

    static ArrayList<String> steps(int[][] arr, int row, int col, int n,String path){
        if(row == n - 1 && col == n -1){
            System.out.println(path);
            ans.add(path);
            return ans;
        }
        if(isValid(arr,n,row + 1,col)){
            arr[row][col] = 0;
            ans.addAll(steps(arr,row + 1, col, n, path + "D"));
            arr[row][col] = 1;
        }

        if(isValid(arr,n,row ,col + 1)){
            arr[row][col] = 0;
            ans.addAll(steps(arr,row , col + 1, n, path + "R"));
            arr[row][col] = 1;
        }

        if(isValid(arr,n,row - 1,col)){
            arr[row][col] = 0;
            ans.addAll(steps(arr,row - 1, col, n, path + "U"));
            arr[row][col] = 1;
        }

        if(isValid(arr,n,row ,col - 1)){
            arr[row][col] = 0;
            ans.addAll(steps(arr,row , col - 1, n, path + "L"));
            arr[row][col] = 1;
        }
        return ans;
    }

    private static boolean isValid(int[][] arr,int n, int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n && isSafe(arr, row, col);
    }

    public static boolean isSafe (int[][] arr, int row, int col){
        return arr[row][col] == 1;
    }



}
