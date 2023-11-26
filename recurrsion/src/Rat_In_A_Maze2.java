import java.util.ArrayList;
import java.util.Arrays;
public class Rat_In_A_Maze2 {
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,1},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        int n = 4;

        int[][] maze2 = {
                {1,0},
                {1,0}
        };
        int n2 = 2;
        int[][] index = new int[n][n];
        boolean[][] isVisited = new boolean[n][n];
//        ArrayList<String> ans = path(maze,0,0,isVisited,n,"",index);
//        System.out.println(ans);
//        for(int[] arr: index) {
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println();
//        for(int[] arr: maze) {
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println();
        path(maze,0,0,isVisited,n,"",index);
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if(maze[i][j] != index[i][j]){
                    maze[i][j] = 0;
                }
            }
        }
        System.out.println();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i<n; i++){
            result.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
               result.get(i).add(maze[i][j]);
            }
        }
//        for(int[] arr: maze) {
//            System.out.println(Arrays.toString(arr));
//        }
        System.out.println(result);

    }

    static void path(int[][] maze, int row, int col, boolean[][] isVisited, int n,String path,int[][] index){
        if(row == n - 1 && col == n - 1){
//            ArrayList<String> temp = new ArrayList<>();
//            temp.add(path);
            return;
        }

//        ArrayList <String> ans = new ArrayList<>();

        if(isSafe(maze,isVisited,row + 1,col,n)){
            isVisited[row][col] = true;
            if(index[row][col] == 0) {
                index[row][col]++;
            }
//            ans.addAll(path(maze, row + 1, col, isVisited,n,path + "D",index));
            path(maze, row + 1, col, isVisited,n,path + "D",index);
            isVisited[row][col] = false;
        }

        if(isSafe(maze,isVisited,row,col - 1,n)){
            isVisited[row][col] = true;
            if(index[row][col] == 0) {
                index[row][col]++;
            }
//            ans.addAll(path(maze, row, col - 1, isVisited,n,path + "L",index));
            path(maze, row , col - 1, isVisited,n,path + "D",index);
            isVisited[row][col] = false;
        }

        if(isSafe(maze,isVisited,row,col + 1,n)){
            isVisited[row][col] = true;
            if(index[row][col] == 0) {
                index[row][col]++;
            }
//            ans.addAll(path(maze, row, col + 1, isVisited,n,path + "R",index));
            path(maze, row , col + 1, isVisited,n,path + "D",index);
            isVisited[row][col] = false;
        }

        if(isSafe(maze,isVisited,row - 1,col,n)){
            isVisited[row][col] = true;
            if(index[row][col] == 0) {
                index[row][col]++;
            }
//            ans.addAll(path(maze, row - 1, col, isVisited,n,path + "U",index));
            path(maze, row - 1, col, isVisited,n,path + "D",index);
            isVisited[row][col] = false;
        }

//        return ans;
    }

    static boolean isSafe(int[][] maze, boolean[][] isVisited, int row, int col,int n){
        if(row >= 0 && row < n && col >= 0 && col < n) {
            if(maze[row][col] == 1 && !isVisited[row][col]){
                return true;
            }
        }
        return false;
    }
}
