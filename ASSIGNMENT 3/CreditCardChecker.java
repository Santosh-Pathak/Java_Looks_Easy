import java.util.Scanner;

abstract class Card {
    abstract void cardChecker(String s);
}

class MasterClass extends Card {
    void cardChecker(String s) {
        if (s.charAt(0) == 5 && s.charAt(1) == 1 || s.charAt(0) == 5 && s.charAt(1) == 5 && s.length() == 15) {
            System.out.println("VALID MasterCard  ");

        } else {
            System.out.println("INVALID MasterCard  ");

        }
    }
}

class Visa extends Card {
    void cardChecker(String s) {
        if (s.charAt(0) == 4 && s.length() == 13 || s.length() == 16) {
            System.out.println("VALID Visa Card ");

        } else {
            System.out.println("INVALID Visa Card ");

        }
    }
}

class AmericanExpress extends Card {
    void cardChecker(String s) {
        if (s.charAt(0) == 3 && s.charAt(1) == 4 || s.charAt(0) == 3 && s.charAt(1) == 7 && s.length() == 15) {
            System.out.println("VALID AmericanExpress Card ");

        } else {
            System.out.println("INVALID AmericanExpress Card  ");

        }
    }
}

public class CreditCardChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card c;
        MasterClass m = new MasterClass();
        Visa v = new Visa();
        AmericanExpress a = new AmericanExpress();
        System.out.print("Enter the Card Number : ");
        String card = sc.nextLine();
        while (true) {
            System.out.println("Enter Card Type : ");
            System.out.println("Press 1 for Master Card ");
            System.out.println("Press 2 for Visa ");
            System.out.println("Press 3 for American Express ");
            int n = sc.nextInt();
            if (n == 1) {
                c = m;
                c.cardChecker(card);
                break;
            } else if (n == 2) {
                c = v;
                c.cardChecker(card);
                break;

            } else if (n == 3) {
                c = a;
                c.cardChecker(card);
                break;
            } else {
                System.out.println("INVLID OPTION !!!!");
                break;
            }
        }
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
       
        sc.close();
    }
}
