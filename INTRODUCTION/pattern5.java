
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j <= n-i;j++) {
                System.out.print(" ");
            }
            // print Numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(i +j+ 1);
            }
            int k=2*i;
            for (int j =1; j <= i; j++) {
                System.out.print(k);
                k--;
            }


            System.out.println();

        }
        sc.close();
    }
}
