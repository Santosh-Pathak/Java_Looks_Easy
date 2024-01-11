import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();
        // upper part
        for (int i = 0; i < n; i += 2) {
            // print spaces
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i -= 2) {
            // print spaces
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
