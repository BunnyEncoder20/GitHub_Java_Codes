//calculate Age when input is last 2 digits of birth and current year

import java.util.*;
public class day9pt5 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int birthyear = op.nextInt();
        int curryear = op.nextInt();

        if (birthyear>=curryear){
            System.out.println("Age = "+((100-birthyear) + (curryear)));
        }
        else{
            System.out.println("Age = "+(curryear-birthyear));
        }
        op.close();
    }
}
