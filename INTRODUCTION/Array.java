import java.util.*;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers of Elements : ");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println();
        System.out.print("Enter the  Elements : ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        int sum=0;
        System.out.print("The  Elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
            sum+=Arr[i];
        }
        System.out.print("The Sum of Elements is  : "+sum);

    }
}
