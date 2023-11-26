import java.util.Scanner;
public class NumHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[n];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter the query");
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int num = sc.nextInt();
            System.out.println("Count of " + num + ": " + hash[num]);
        }
    }
}
