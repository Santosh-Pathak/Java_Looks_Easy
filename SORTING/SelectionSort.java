import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // SELECTION SORT
        int min;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }

        }
        System.out.println("Sorted  Elements of Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
