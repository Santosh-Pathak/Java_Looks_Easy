 /* QUESTION 2 => Write a Program to find the Length of last Word .
 */
import java.util.Scanner;
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String word = sc.nextLine();
        word = word.trim();
        int count = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        System.out.println("Length of Last Word is  = " + count);
        sc.close();
    }
}
