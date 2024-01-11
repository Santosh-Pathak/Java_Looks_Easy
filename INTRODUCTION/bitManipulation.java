
//BIT-MASKING ->when we left shift 1 by any postion => 1<<position

public class bitManipulation {
    public static void main(String[] args) {
        //**********************get bitManipulation =>Check whether given position was 1 or 0
        int n = 5;// 0101
        int position = 2;
        // int result = 1 << position;
        // if ( (result & n)==0) {
        // System.out.print("Bit is 0");
        // }
        // else
        // {
        // System.out.print("Bit is 1");
        // }
        //********************** */ set bitManipulation => set the postion to 1********
        // int bitmask = 1 << position;
        // int newnumber = (bitmask | n);
        // System.out.print(newnumber);
        //************************ CLEAR bitManipulation =>set the positioned bit to -> 0 
        // int bitmask = 1 << position;
        // int newnumber = (~(bitmask) & n);
        // System.out.print(newnumber);
        //************************ UPDATE bitManipulation =>Update the positioned bit to -> 0 or vice-versa
        
    }
}
