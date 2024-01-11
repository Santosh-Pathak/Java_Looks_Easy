public class pattern {
    public static void main(String args[]) {
        System.out.println("JAI SHREE RAM !!!!");
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // *
        // **
        // ***
        // ****
        // *****
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        //     if(i==0||j==0||j==4||i==4)
        //     System.out.print("*");
        //     else
        //     System.out.print(" ");

        // }
        // System.out.println("");
        // }
        //*****
        //*   * 
        //*   *
        //*   *
        //*****
        for(int i=0;i<5;i++)
        {   //inner loop->Print Spaces
            for(int j=0;j<5-1;j++){
                System.out.print(" ");
            }
            //inner loop->printf *
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
