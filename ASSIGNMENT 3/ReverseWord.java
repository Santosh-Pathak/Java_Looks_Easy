
/**
 * ReverseWord
 */
import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine(); // java Programming
        // split Each word in Array
        String words[] = str.split(" "); // split each word in array
        String reverseStr = "";
        String reverseWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            reverseStr += reverseWord;
            reverseStr += " ";
        }

        System.out.println("OUTPUT : "+ reverseStr);
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }
}