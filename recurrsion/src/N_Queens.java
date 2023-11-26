public class N_Queens {
    public static void main(String[] args){
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println(input(board, 0));
    }

    static int input(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
           if(isSafe(board,row,i)){
               board[row][i] = true;
               count +=  input(board,row + 1);
               board[row][i] = false;
           }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr : board){
            for(boolean element: arr){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


    private static boolean isSafe(boolean[][] arr, int row, int column) {
        for(int i = 0; i< row; i++){
            if(arr[i][column]){
                return false;
            }
        }
        int maxLeft = Math.min(row,column);
        for(int i = 1; i<= maxLeft; i++){
           if(arr[row - i][column - i]){
               return false;
           }
        }
        int maxRight = Math.min(row,arr.length - column - 1);
        for(int i = 0;i <= maxRight; i++){
            if(arr[row - i][column + i]){
                return false;
            }
        }
        return true;
    }
}
