import java.util.Scanner;
import java.lang.String;
public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine(); 
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                {   
                    String  c = str.substring(j,j);
                    str.replace(c,"a");
                }
            }
        }

        System.out.println("OUTPUT : "+ str);
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }
    
}
