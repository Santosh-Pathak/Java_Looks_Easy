public class commandLineArguments {
    public static void main(String[] args) {
        int sum = 0;
        int x=0;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            //  EXCEPTION HANDLING
           
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum of Command Line Arguments is " + sum);

    }
}
