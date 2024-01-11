import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted  Elements of Array : ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}