
public class reverseString {
    //=========================APPROACH 1=================================
    // public static void reverse(StringBuilder S, int s, int e) {
    //     if (s == e)
    //         return;

    //     char begin = S.charAt(s);
    //     char end = S.charAt(e);
    //     S.setCharAt(s, end);
    //     S.setCharAt(e, begin);
    //     reverse(S, s+1, end-1);
    // }
    //=========================APPROACH 2=================================

    // public static String reverse(String str) {
    //     if (str.length() <= 1) {
    //         return str;
    //     }
    //     return reverse(str.substring(1)) + str.charAt(0);
    //  }
    //=========================APPROACH 3=================================

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }

        // System.out.println((str));
        return reverse(str.substring(1)) + str.charAt(0);
    }
    

    // public static void main(String[] args) {
    //     StringBuilder str =new StringBuilder("hello");
    //     int e=str.length()-1;
    //     reverse(str,0,e);
    //     System.out.println(str);
    // }
    public static void main(String[] args) {
        String str ="hello";
        reverse(str);
        System.out.println(str);
    }
}
