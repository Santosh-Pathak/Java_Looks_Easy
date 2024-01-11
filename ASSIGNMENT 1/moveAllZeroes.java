import java.util.Scanner;
public class moveAllZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter the  Elements : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        i =0;
        int j= arr.length-1;
        //APPROACH 1
        // while (i<j) {
        //     if(arr[i]!=0)
        //     {
        //         i++;
        //     }
        //     else if (arr[j] == 0)
        //     {
        //         j--;
        //     }
        //     else{
        //         int temp = arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //     }
        // }
        //APPROACH 2
        int s=0;
        for( i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i]=arr[s];
                arr[s]=temp;
                s++;
            }
        }

        System.out.println("Resulting array is : ");
        for (i = 0; i < n; i++)
        System.out.print( arr[i]+" ");
        
    }
}
