import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
