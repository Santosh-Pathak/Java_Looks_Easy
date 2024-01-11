import java.util.Scanner;

public class function {

    // public static void myName(String name){
    // System.out.print(name);
    // }
    // public static void main(String [] args){
    // myName("SantoshPathak");

    // }

    public static int findSum(int n, int m) {
        return m + n;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Valur of m : ");
        int m = sc.nextInt();
        System.out.print("Enter Valur of n : ");
        int n = sc.nextInt();
        int sum = findSum(n, m);
        System.out.print("Sum = "+sum);
    }
}
