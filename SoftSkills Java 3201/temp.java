import java.util.Scanner;

public class temp{
    public static void main(String[] args) {
        // Scanner op = new Scanner(System.in);
        int rows  = 10;
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows-1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}