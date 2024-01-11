
import java.util.*;
import java.util.Scanner;

public class insertionSort {
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
        // INSERTION SORT
        int j;
        for (int i = 1; i < n; i++) {
            int current = Arr[i];// pic ith index for Comparing
            for ( j = i - 1; j >= 0; j--) {
                if (Arr[j] > current) {
                    // shift
                    Arr[j+ 1] = Arr[j];
                } 
                else { // stop the iteration
                    break;
                }
            }
            Arr[j + 1] = current;

        }
        System.out.print("The  Elements in Sorted Order are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}
