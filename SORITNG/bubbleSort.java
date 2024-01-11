import java.util.*;
import java.util.Scanner;

public class bubbleSort {
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    //swap
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
        System.out.print("The  Elements in Sorted Order are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}
