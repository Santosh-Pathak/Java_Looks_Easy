public class keypadProblem {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombination(String str, int index, String Combination) {
        if(index == str.length())
        {
            System.out.println(Combination);
            return;
        }
        char currentchar = str.charAt(index);
        String mappimg = keypad[currentchar - '0'];

        for(int i=0;i<mappimg.length();i++)
        {
            printCombination(str, index+1, Combination+mappimg.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "1234";
        printCombination(str, 0, "");
    }

}
