
public class towerOfHanoi {
    public static void Problemhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer of " + n + " from " + src + " to " + dest);
            return;

        }
        Problemhanoi(n - 1, src, dest, helper);
        System.out.println("transfer of " + n + " from " + src + " to " + dest);
        Problemhanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        int n = 2;
        Problemhanoi(n,"S","H","D");

    }
}
