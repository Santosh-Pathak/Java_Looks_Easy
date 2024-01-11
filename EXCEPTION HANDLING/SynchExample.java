class Account {
    int balance;

    public Account() {
        balance = 5000;
    }

public synchronized void withdraw(int bal)
{
 if(bal<=balance)
 {
 System.out.println("Amount Widraw " + bal);
 try
{
 Thread.sleep(2000);
}
catch(Exception ex)
{
 System.out.println("EXCEPTION OCCURED.."+ex);
}
balance= balance-bal;

System.out.println("Balance remaining:::" + 
balance);
}
}
}

class Amtthread implements Runnable {
    Account obj;

    public Amtthread(Account a) {
        obj = a;
    }

    public void run() {
        obj.withdraw(500);
    }
}

public class SynchExample {
public static void main(String args[])
{
Account a1=new Account();
Amtthread c1=new Amtthread(a1);

Thread t1=new Thread(c1, "ABC");
Thread t2=new Thread(c1,"XTZ");
t1.start();
t2.start();
}
}