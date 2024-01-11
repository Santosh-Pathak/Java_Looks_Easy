//******* ASSIGNMENT - 2 *********/
import java.util.Scanner;
import java.util.Arrays;

public class Stockers {
    /*********************
     * FUNCTION OF THE PROGRAM**********************************
     */
    public void displayAscending(double stocks[]) {
        Arrays.sort(stocks); // MERGE SORT O(NLOG(N))
        System.out.println("Stocks in Ascending  Order are : ");

        for (int i = 0; i < stocks.length; i++) {
            System.out.print(stocks[i] + " ");
        }
        System.out.println();

    }

    public void displayDecending(double stocks[]) {
        Arrays.sort(stocks); // MERGE SORT O(NLOG(N))
        System.out.println("Stocks in Decending Order are : ");

        for (int i = stocks.length - 1; i >= 0; i--) {
            System.out.print(stocks[i] + " ");
        }
        System.out.println();
    }

    public void rosedStocks(Boolean valid[]) {
        int c = 0;
        for (Boolean a : valid) {
            if (a == true)
                c++;
        }
        System.out.println("Total no of companies whose stock price Rosed today : " + c);

    }

    public void declinedStocks(Boolean valid[]) {
        int c = 0;
        for (Boolean a : valid) {
            if (a == false)
                c++;
        }
        System.out.println("Total no of companies whose stock price declined today : " + c);

    }

    public void searchStock(double stocks[], double value) {
        Boolean check = false;
        for (double a : stocks) {
            if (a == value) {
                System.out.println("Stocks of Value " + value + " Is Present");
                check = true;
            }
        }
        if (check == false)
            System.out.println("Stocks of Value " + value + " Is NOT Present");

    }

    /****************************************************************************** */

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Stockers st = new Stockers();
        System.out.println("ENTER THE NUMBERS OF COMPANIES : ");
        n = sc.nextInt();
        Boolean valid[] = new Boolean[n];
        double stocks[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Current Stock price of the Company " + (i + 1));
            stocks[i] = sc.nextDouble();
            System.out.println("Whether Company's Stock prixe rose today  Compare to Yesterday (True/False): ");
            valid[i] = sc.nextBoolean();
        }
        System.out.println(
                "**************************************************************************************************************************************************************");
        int exit = 1;
        while (exit == 1) {
            System.out.println("Enter the Operation that you want to perform : ");
            System.out.println(" 1 : Display the Companies Stock Prices in Ascending Order ");
            System.out.println(" 2 : Display the Companies Stock Prices in Decendong Order ");
            System.out.println(" 3 : Display the Total Number of Companies for which Stock prices Rose today ");
            System.out.println(" 4 : Display the Total Number of Companies for which Stock prices Declined today ");
            System.out.println(" 5 : Search a Specific Stock Price ");
            System.out.println(" 6 :  Press 0 to EXIT ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0: {
                    exit = 0;
                    break;
                }
                case 1:
                    st.displayAscending(stocks);
                    break;
                case 2:
                    st.displayDecending(stocks);
                    break;
                case 3:
                    st.rosedStocks(valid);
                    break;
                case 4:
                    st.declinedStocks(valid);
                    break;
                case 5: {
                    System.out.println(" Enter the key Value : ");
                    double value = sc.nextDouble();
                    st.searchStock(stocks, value);
                }
            }

        }

        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }

}