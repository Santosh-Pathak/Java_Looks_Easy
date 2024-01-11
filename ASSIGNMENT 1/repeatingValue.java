import java.util.Scanner;

public class repeatingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter the  Elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        label: for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("TRUE");

                    break label;
                }
            }
        }
        if (i == n)
            System.out.println("FALSE ");

    }
}
