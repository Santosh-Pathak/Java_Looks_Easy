import java.util.HashSet;

public class uniqueSubsequence {
    public static void findSubsequences(String str, String newString, int index,HashSet<String> set) {
        if (index == str.length()) {
            if(set.contains(newString)){
                return ;
            }
            else{
            System.out.print(newString + " ");
            set.add(newString);
            return;
            }
        }
        char currentchar = str.charAt(index);
        findSubsequences(str, newString + currentchar, index + 1,set);
        findSubsequences(str, newString, index + 1,set);
    }

    public static void main(String[] args) {
        String str = "abcb";
        String newString = "";
        HashSet<String> set =new HashSet<>();
        findSubsequences(str, newString, 0,set);
    }
}
