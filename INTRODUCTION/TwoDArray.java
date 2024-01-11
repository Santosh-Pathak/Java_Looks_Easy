import java.util.*;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Enter the Numbers of Rows : ");
        n = sc.nextInt();
        System.out.print("Enter the Numbers of Columns : ");
        m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println();
        System.out.print("Enter the  Elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}
