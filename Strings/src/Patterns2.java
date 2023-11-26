import java.util.Scanner;

public class Patterns2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = 0; row<2*n; row ++){
            int totalCol = row > n ? 2 * n - row : row;
            int space = n - totalCol;
            for(int column = 0; column< space; column++ ){
                System.out.print(" ");
            }
            for(int column = 0; column < totalCol; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
