import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // INSERTION SORT
        int j=0;
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            for ( j = i-1; j >=0; j--) {
                if(a[j]>temp)
                {
                    a[j+1]=a[j];
                }else
                {
                    break;
                }
            }
            a[j+1] =temp;

        }
        System.out.println("Sorted  Elements of Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
