import java.util.Scanner;

class CarSurvey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int report[][] = new int[4][4];
        String cities[] = {"Delhi", "Mumbai","Chennai","Kolkatta"};
        int cityCode, carCode;
        System.out.println("Press 1 to Enter the Count of Cars || 0 to exit from Survey : ");
        int press = sc.nextInt();
        while (press == 1) {
            
            System.out.println("Press 1 to Select Delhi City  ");
            System.out.println("Press 2 to Select Mumbai City  ");
            System.out.println("Press 3 to Select Chennai City  ");
            System.out.println("Press 4 to Select Kolkatta City ");
            cityCode = sc.nextInt();
            System.out.println("Press 1 to Enter Maruti=K10 Model  ");
            System.out.println("Press 2 to Enter Zen-Astelo Model  ");
            System.out.println("Press 3 to Enter Wagnor Model  ");
            System.out.println("Press 4 to Enter Maruti-SX4 Model  ");
            carCode = sc.nextInt();

            report[cityCode - 1][carCode - 1] += 1;

            System.out.print("Press 1 to Continue || 0 to Exit : ");
            press = sc.nextInt();

        }
        System.out.println("*************************CAR SURVEY TABLE**************************");
        System.out.println("\t\t   Maruti-K10\t  Zen-Astelo\t\t Wagnor\t\t Maruti-SX4");
        for(int i=0;i<4;i++)
        {   
            System.out.print(cities[i]+"  ");
            for(int j=0;j<4;j++)
            {
            System.out.print("\t\t"+report[i][j]);
            }
            System.out.println();

        }
        
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }

}