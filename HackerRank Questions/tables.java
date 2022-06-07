import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int integer = op.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(integer + " x " + i + " = " + integer*i);
        }
        op.close();
    }
}
