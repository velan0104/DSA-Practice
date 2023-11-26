import java.util.ArrayList;

public class Nearest_Exit {
    public static void main(String[] args) {
        char[][] maze = {
                {'+' , '+','.' , '+'},
                {'.' ,'.' ,'.' , '+'},
                {'+' ,'+' , '+' ,'.'}
        };
        char[][] maze2 = {
            {'.','+'}
        };
        char[][] maze3 = {
                {'+', '+','+'},
                {'.','.','.'},
                {'+', '+','+'}
        };
        int count = 0;
        int[] entrance = {1,0};
        ArrayList<Integer> ans = steps(maze3,entrance[0],entrance[1],count);
        if(ans.isEmpty()){
            System.out.println(-1);
        }else {
            System.out.println(min(ans));
        }
        System.out.println(ans);
    }
    static ArrayList<Integer> steps(char[][] maze, int row, int col, int count){
        if(row == 0 || row == maze.length - 1|| col == 0 || col == maze[0].length - 1){
            ArrayList<Integer> cnt = new ArrayList<>();
            cnt.add(count);
            return cnt;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(isValid(maze,row + 1, col)){
            maze[row][col] = '+';
            list.addAll(steps(maze,row + 1, col,count + 1));
            maze[row][col] = '.';
        }
        if(isValid(maze,row - 1, col)){
            maze[row][col] = '+';
            list.addAll(steps(maze,row - 1, col, count + 1));
            maze[row][col] = '.';
        }
        if(isValid(maze,row, col + 1)){
            maze[row][col] = '+';
            list.addAll(steps(maze,row, col + 1, count + 1));
            maze[row][col] = '.';
        }
        if(isValid(maze,row, col - 1)){
            maze[row][col] = '+';
            list.addAll(steps(maze,row, col - 1,count + 1));
            maze[row][col] = '.';
        }

        return list;
    }

    static boolean isValid(char[][] maze, int row, int col){
        if(row >= 0 && row < maze.length && col >= 0 && col < maze.length){
            if (maze[row][col] != '+') {
                return true;
            }
        }
        return false;
    }

    static int min(ArrayList<Integer> ans){
        int val = ans.get(0);
        for(int i: ans){
            if(i < val){
                val = i;
            }
        }
        return val;
    }
}
