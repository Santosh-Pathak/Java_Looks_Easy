import java.util.Arrays;
import java.util.Scanner;

public class sortThePeople {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of People's: ");
        int n = sc.nextInt();
        String names[] = new String[n];
        int heights[] = new int[n];

        System.out.println("Enter the  Names : ");
        for (i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        System.out.println("Enter the  Heights Respectively : ");
        for (i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // form a 2D array using people's height and their position in original array.
        int[][] people = new int[names.length][2];
        for (i = 0; i < names.length; i++)
            people[i] = new int[] { heights[i], i };

        // sort in descending order by the people's heights.
        Arrays.sort(people, (a, b) -> b[0] - a[0]);

        String[] res = new String[names.length];
        // Time: O(N)
        // Get result from sorted array.
        for (i = 0; i < names.length; i++)
            res[i] = names[people[i][1]];

        System.out.println(" Names in Sorted Order are : ");

        for (i = 0; i < names.length; i++)
            System.out.print(res[i] + " ");

    }
}
