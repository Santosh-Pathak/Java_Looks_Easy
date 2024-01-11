// 25. Write a program to remove duplicates from a list

import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }
        Set<Integer> unique = new HashSet<>(list);
        List<Integer> uniqueNumber = new ArrayList<>(unique);
        for (int num : uniqueNumber) {
            System.out.print(num + " ");
        }

    }
}
