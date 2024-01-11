import java.util.Scanner;
import java.util.jar.Attributes.Name;

class representBank {
    String name;
    String AccNo;
    String Type;
    Double amt;

    representBank(String name, String AccNo, String Type, Double amt) {
        this.name = name;
        this.AccNo = AccNo;
        this.Type = Type;
        this.amt = amt;
    }

    void deposit(double money) {
        amt = amt + money;
        System.out.println("Rupees " + money + " has been Deposited to Your Account ");

    }

    void Withdrawl(double money) {
        if (money < amt) {
            System.out.println("Rupees " + money + " is Withdrawl Successfully\nThank You !!");
            amt -= money;
        } else {
            System.out.println("Insufficient Money !!");

        }
    }

    void display() {
        System.out.println("Name of Depositor : " + name);
        System.out.println("Remaining Balance : " + amt);

    }
}

public class bankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String AccNo;
        String Type;
        Double amt;
        System.out.print("Enter the Name of Depositor : ");
        name = sc.nextLine();
        System.out.print("Enter the Account Number  : ");
        AccNo = sc.nextLine();
        System.out.print("Enter Card Type : ");
        Type = sc.nextLine();
        System.out.print("Enter the Balance : ");
        amt = sc.nextDouble();
        representBank b1 = new representBank(name, AccNo, Type, amt);
        System.out.print("Enter the Amount you want to Deposit : ");
        Double money = sc.nextDouble();
        b1.deposit(money);
        System.out.print("Enter the Amount you want to Withdrawl : ");
        Double withdraw = sc.nextDouble();
        System.out.println("************************************************************************************************************ ");
        b1.Withdrawl(withdraw);
        b1.display();
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }
}
