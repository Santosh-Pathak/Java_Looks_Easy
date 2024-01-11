import java.util.Arrays;
import java.util.Scanner;

public class findMissing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int i;
        System.out.println("Enter the  Elements : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        int num = arr.length;
        int totalsum = num * (num + 1) / 2; // sum of first n natural numbers
        for (int j : arr)
            totalsum -= j;
        System.out.println(" Missing number is "+totalsum);

    }
}
