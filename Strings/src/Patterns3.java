import java.util.Scanner;

public class Patterns3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = 1; row<= 2*n; row++){
            int totalCol = row <= n ? n - row + 1: row - n;
            int space = 2 * (n - totalCol);
            for(int col = 0; col<totalCol; col++){
                System.out.print("*");
            }
            for(int col = 0; col<space; col++){
                System.out.print(" ");
            }
            for(int col = 0; col<totalCol; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
