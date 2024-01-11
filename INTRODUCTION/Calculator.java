import java.util.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************************( CALCULATOR )*******************************");
        int choice;
        System.out.print("PRESS 1 TO CONTINUE AND 0 TO EXIT  : ");
        choice = sc.nextInt();
        while (choice==1) {
            System.out.println("Press :");
            System.out.println(" 1 : Addition \n 2 : Subtraction \n 3: Multiplication \n 4: Division \n 5: Modulo \n");
            int c = sc.nextInt();
            double a, b;
            switch (c) {
                case 1: {
                    System.out.print("Enter the Value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the Value of b :");
                    b = sc.nextInt();
                    System.out.println("a + b = " + (a + b));
                }
                    break;
                case 2: {
                    System.out.print("Enter the Value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the Value of b :");
                    b = sc.nextInt();
                    System.out.println("a - b = " + (a - b));
                }
                    break;
                case 3: {
                    System.out.print("Enter the Value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the Value of b :");
                    b = sc.nextInt();
                    System.out.println("a * b = " + (a * b));
                }
                    break;
                case 4: {
                    System.out.print("Enter the Value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the Value of b :");
                    b = sc.nextInt();
                    System.out.println("a / b = " + (a / b));
                }
                    break;
                case 5: {
                    System.out.print("Enter the Value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the Value of b :");
                    b = sc.nextInt();
                    System.out.println("a % b = " + (a % b));
                }
                    break;

                default:
                    System.out.println("ENTER VALID OPTION !!!!");
                    break;
            }
            System.out.print("PRESS 1 TO CONTINUE AND 0 TO EXIT  : ");
            choice = sc.nextInt();
        }

    }
}
