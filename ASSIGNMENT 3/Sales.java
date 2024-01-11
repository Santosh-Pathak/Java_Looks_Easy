import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        int sum = 0;
        int fatherSum = 0;
        System.out.println("Enter the Sales : ");
        for (int i = 0; i < 4; i++) {
            sum = 0;
            System.out.println("Salesman " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("Quater  " + (j + 1) + " = ");
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
                matrix[4][j] += matrix[i][j];
            }
            matrix[i][4] = sum;
            fatherSum += sum;
            matrix[4][4] = fatherSum;
        }

        int j;
        System.out.println("             Quater1\t\tQuater2\t\tQuater3\t\tQuater4\t\tTotal");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Salesman"+(i+1));
            for (j = 0; j < 5; j++) 
            {
                System.out.print("\t"+matrix[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }
}
