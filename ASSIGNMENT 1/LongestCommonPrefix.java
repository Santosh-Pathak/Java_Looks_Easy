//LARGEST COMMON PREFIX
import java.util.Scanner;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = input.nextInt();
        input.nextLine(); // consume the new line character left by nextInt()
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            strs[i] = input.nextLine();
        }
        input.close();
        String longestCommonPrefix = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + longestCommonPrefix);
    }
}
