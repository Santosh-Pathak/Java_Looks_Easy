import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String candidates[] = new String[5];
        int votes[] = new int[5];
        double percentage[] = new double[5];
        double sum = 0;
        System.out.println("Enter CANDIDATES names : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " : ");
            candidates[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("Enter the VOTES Received : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(candidates[i] + " : ");
            votes[i] = sc.nextInt();
            sum += votes[i];
        }
        for (int i = 0; i < 5; i++) {
            percentage[i] = (votes[i] / sum) * 100;
        }

        System.out.println("Candidates Name\t Votes Received\t Percentage of Total Votes Recieived");
        for (int i = 0; i < 5; i++) {
            System.out.println(candidates[i] + "\t\t   " + votes[i] + "\t\t\t" + percentage[i]);
        }
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
        sc.close();
    }

}
