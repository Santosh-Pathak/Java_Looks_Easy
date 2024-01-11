import java.util.Scanner;

public class ifSorted {
    public static boolean sorted(int arr[], int index) {
        if (index == arr.length - 1)
            return true;
        if (arr[index] >= arr[index + 1])
            return false;

         return sorted(arr, index + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5, 6 };
        System.out.print(sorted(arr, 0));
    }

}
