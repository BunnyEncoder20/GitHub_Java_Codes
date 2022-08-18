import java.util.Scanner;

public class day9 {


    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter n1 : "); int n1 = op.nextInt(); System.out.println("");
        System.out.print("Enter n2 : "); int n2 = op.nextInt();

        if (n1==n2) {
            System.out.printf("%d is equal to %d",n1,n2);
        } else {
            if (n1>n2) {
                System.out.printf("%d is greater than %d",n1,n2);
            }
            else {
                System.out.printf("%d is greater than %d",n2,n1);
            }
        }


        op.close();
    }
}
