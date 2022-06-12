import java.io.*;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
    // Write your code here
        if (n==0) {
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }

}

public class recursion {
    public static void main(String[] args) throws IOException {
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        System.out.println(Result.factorial(n)); 
        op.close();
    }
}
