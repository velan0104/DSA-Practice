import java.util.Scanner;

public class Patterns$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = 0; row<2*n - 1; row++){
            int star = row < n ? row+1: 2*n - row - 1;
            int space = 2*(n - star);
            for(int col = 0; col <star; col++){
                System.out.print("* ");
            }
            for(int col = 0; col<space; col++){
                System.out.print("  ");
            }
            for(int col = 0; col <star; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
