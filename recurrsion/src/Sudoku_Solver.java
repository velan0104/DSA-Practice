public class Sudoku_Solver {
    public static void main(String[] args) {
        char[][] board = {{'.', '8', '9', '.', '2', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '4', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'1', '6', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '4', '.', '.', '.', '8', '9'},
                {'.', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'7', '.', '.', '.', '.', '.', '3', '.', '.'},
                {'3', '.', '.', '6', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '9', '.', '.', '.', '.'}
        };
        solve(board);
        for(char[] arr: board){
            for(char ans: arr){
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }

    static boolean solve(char[][] board) {
        for(int row = 0; row<board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {

                if(board[row][col] == '.'){
                    for(char val = '1' ; val <= '9' ; val++){
                        if(isValid(board,row,col,val)){
                            board[row][col] = val;

                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] board, int row, int col, char val){
        for (int i = 0; i < 9; i++) {
            if(board[i][col] == val){
                return false;
            }
            if(board[row][i] == val){
                return false;
            }
            if(board[3 * (row/3) + (i/3)][3 * (col/3) + (i%3)] == val ){
                return false;
            }
        }
        return true;
    }
}
