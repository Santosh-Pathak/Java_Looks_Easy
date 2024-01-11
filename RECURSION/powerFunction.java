import java.util.Scanner;
public class powerFunction {
    public static int power(int n, int p) {
        if (p == 0)
            return 1;
        
        int ans = n * power(n, p - 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n =sc.nextInt() ;
        System.out.print("Enter the Power of Number  : ");
        int p = sc.nextInt();
        double ans = power(n, p);
        System.out.println("ANSWER = "+ans);
        sc.close();

    }
    
}
