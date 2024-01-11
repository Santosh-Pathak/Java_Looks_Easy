import java.util.Scanner;

class TellCall {
    static String phno;
    static String sname;
    static int n;
    static double amt;

    TellCall(String phno, String sname, int n) {
        phno = this.phno;
        sname = this.sname;
        n = this.n;
    }

    void compute(int n) {
        if (n <= 100)
            amt = 500;
        else if (n > 100 && n <= 200) {
            amt = 500 + (200 - n) * 1.0;
        } else if (n > 200 && n <= 300) {
            amt = 500 + (300 - n) * 1.20;
        } else {
            amt = 500 + (n - 300) * 1.50;
        }
    }

    void display() {
        System.out.println("Customer Name : " + sname);
        System.out.println("Phone Number  : " + phno);
        System.out.println("Number of Call Made : " + n);
        System.out.println("Bill Amount : " + amt);

    }

}

public class PhoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        TellCall.sname = sc.nextLine();
        System.out.print("Enter Phone Number : ");
        TellCall.phno = sc.nextLine();
        System.out.print("Numbers Of Call Made : ");
        TellCall.n = sc.nextInt();
        TellCall newCall = new TellCall(TellCall.sname, TellCall.phno, TellCall.n);

        newCall.compute(TellCall.n);
        newCall.display();
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
       
        sc.close();
    }
}
