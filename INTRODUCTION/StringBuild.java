import java.util.*;

public class StringBuild {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Santosh");
        System.out.println(sb);
        // //chaacter at index =0
        // System.out.println(sb.charAt(0));
        // //Set char at index
        // sb.setCharAt(0,'P');
        // System.out.println(sb);
        // Insert at Specific position
        // sb.insert(0, 'S');
        // System.out.println(sb);
        // Delete a Substring or character
        // sb.delete(0, 1);
        // System.out.println(sb);
        // Append a charcter
        // sb.append("pathak");
        // System.out.println(sb);

        //=============================REVERSE A STRING===========================
        int i = 0;
        int e = sb.length() - 1;
        while (i < e) {
            char a = sb.charAt(i);
            char b = sb.charAt(e);

            sb.setCharAt(i, b);
            sb.setCharAt(e, a);
            i++;
            e--;
        }
        System.out.println(sb);

    }
}
