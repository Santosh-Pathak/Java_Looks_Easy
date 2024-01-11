import java.util.Scanner;

public class MergeSort {
    static void mergeArray(int a[], int s, int e) {
        int mid = s + (e - s) / 2;
        int l1 = mid - s + 1;
        int l2 = e - mid;
        int first[] = new int[l1];
        int second[] = new int[l2];
        // copy Values
        int k = s;
        for (int i = 0; i < l1; i++) {
            first[i] = a[k++];
        }
        k = mid + 1;
        for (int i = 0; i < l2; i++) {
            second[i] = a[k++];
        }
        // Merge two Arrays
        int i = 0;
        int j = 0;
        k = s;
        while (i < l1 && j < l2) {
            if (first[i] < second[j]) {
                a[k++] = first[i++];
            } else {
                a[k++] = second[j++];
            }
        }
        while (i < l1) {
            a[k++] = first[i++];
        }
        while (j < l2) {
            a[k++] = second[j++];
        }

    }

    static void sort(int a[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        sort(a, s, mid);
        sort(a, mid + 1, e);
        mergeArray(a, s, e);

    }

    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(a, 0, n - 1);
        System.out.println("Sorted  Elements of Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
