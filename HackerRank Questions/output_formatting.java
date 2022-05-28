import java.util.Scanner;

public class output_formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        // String s1; int x;
        // for(int i=0;i<3;i++){
        //     s1=sc.next();
        //     x=sc.nextInt();
        //     System.out.printf("%-15s %15s %n",s1,String.format("%03d",x)); ;
        // }
        // To get the left-justified column, you need a percentage symbol, a minus symbol, the number of characters, and then the letter "s" (lowercase). So ''%-15s'' means fifteen characters left-justified.
        // To get a right-justified column the same sequence of characters are used, except for the minus sign.

        // for zero-padding with a length of 5 System.out.print.
        

        //for formatting decimal places in java :
        // System.out.printf("%.<no. of decimal places> <data type>")
        // "%.2f" = 2 decimal places of float . %n = new line
        double test_number = 3.14567;
        System.out.printf("%.1f %n",test_number);
        System.out.printf("%.2f %n",test_number);
        System.out.printf("%.3f %n",test_number);
        System.out.printf("%.4f %n",test_number);
        sc.close();
        System.out.println("================================");
    }
}
