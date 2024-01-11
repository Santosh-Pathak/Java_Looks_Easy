import java.util.Scanner;

public class columnTittle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a MS Word Code : ");
        int code = sc.nextInt();
        int n = code / 26;
        int m = code % 26;
        char a, b;
        a = (char) (64 + n);
        b = (char) (64 + m);
       
            System.out.print(a);
            System.out.println(b);

        sc.close();
    }
}
