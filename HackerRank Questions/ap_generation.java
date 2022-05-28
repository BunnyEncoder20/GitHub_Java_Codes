import java.io.*;
import java.util.*;
import java.lang.Math;

public class ap_generation {
    public static void main(String[] args) {
        // We use the integers , , and  to create the following series:
        // (a + b.2^0) , (a + b.2^0 + b.2^1) , (a + b.2^0 + b.2^1 + b.2^2)......(a + b.2^0 + b.2^1 + b.2^2 +...+b.2^n-1)
        // You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

        int queries, a, b, n, ans;
        Scanner op = new Scanner(System.in);
        queries = op.nextInt();

        for (int i = 0; i < queries; i++) {
            a = op.nextInt();
            b = op.nextInt();
            n = op.nextInt();
            
            ans = a ;
            for (int j = 0; j < n; j++) {
                ans += b*Math.pow(2,j);
                System.out.print(ans+" ");
            }
            System.out.println("\n");
        }


        op.close();
    }
}
