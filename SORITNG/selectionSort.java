
import java.util.*;
import java.util.Scanner;

public class selectionSort {
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
            int small=i;//pic ith index for Comparing
            for (int j = i+1; j < n; j++) {

                if (Arr[small] > Arr[j]) {
                    small=j;
                }
            }
            //compare
            if(small != i)
            {
                int temp = Arr[small];
                Arr[small] = Arr[i];
                Arr[i] = temp;
            }
        }
        System.out.print("The  Elements in Sorted Order are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}
