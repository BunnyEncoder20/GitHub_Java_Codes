import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class temp{
    int x = 10;
    int y = 40;
    String msg = "Hello there, this is a class variable !";

    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String args[]) throws IOException{
        temp obj = new temp();
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
       int rows = Integer.parseInt(op.readLine());

       for (int i = 0; i < rows; i++) {
            for (int j = 2*(rows-i) ; j >=0 ; j--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
       }
        op.close();
    }
}