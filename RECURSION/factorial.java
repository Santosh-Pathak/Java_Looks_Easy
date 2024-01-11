
public class factorial {
    public static int Calfactorial(int n) {
        if (n == 0 || n == 1)
            return n;

        int fact = n * Calfactorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        int ans = Calfactorial(5);
        System.out.println(ans);
    }
}