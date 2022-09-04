//write code for checking strong numbers

import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner op =  new Scanner(System.in);
        int num = op.nextInt();
        int tempnum=num;
        int sum=1;
        while (num<0) {
            int temp;
            for (int i = 1; i <=num ; i++) {
                temp*=i;
            }

            num%=10;
            System.out.println(num);
        }

        if (sum==tempnum)
            System.out.println("Strong Number");
        System.out.println("Not Strong Number");

        op.close();
    }
}
