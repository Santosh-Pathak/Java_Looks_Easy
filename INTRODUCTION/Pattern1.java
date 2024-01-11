import java.util.*;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        // upper half
        for (int i = 0; i <= n; i++) {
            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j = 0; j <=(2*(n-i)); j++) {
                System.out.print(" ");
            }
             // print stars
             for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // lower half
        for (int i = n; i >=0; i--) {
            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j = 0; j <=(2*(n-i)); j++) {
                System.out.print(" ");
            }
             // print stars
             for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
