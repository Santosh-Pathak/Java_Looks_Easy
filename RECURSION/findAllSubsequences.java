import java.util.HashSet;

public class findAllSubsequences {
   public static void findSubsequences(String str , String newString,int index){
            if(index==str.length())
            {   System.out.print(newString+" ");
                 return ;
            }
            char currentchar = str.charAt(index);
            findSubsequences(str,newString+currentchar,index+1);
            findSubsequences(str,newString,index+1);
    }

    public static void main(String[] args) {
        String str="abcb";
        String newString = "";
        findSubsequences(str,newString,0);
    }
}
