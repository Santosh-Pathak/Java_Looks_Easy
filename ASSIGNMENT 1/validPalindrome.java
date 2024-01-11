import java.util.Scanner;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        String temp = "";
        // remove all non-alphanumeric characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
                temp = temp + s.charAt(i);
        }
        temp = temp.toLowerCase();
        System.out.println(temp);
        
        int i = 0;
        int j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                System.out.println(" NOT A VALID PALINDROME........");
                break;
            }
            i++;
            j--;
        }
        if(i>=j)
        System.out.println("VALID PALINDROME!!!!");

        sc.close();
    }
}
