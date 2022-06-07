import java.util.Scanner;

public class odd_even_idx {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int test_cases = op.nextInt();
        String temp = op.nextLine();
        
        for (int i = 0; i < test_cases; i++) {
            String s = op.nextLine();
            char[] c = s.toCharArray();
            int j=0,k=1;
            while (j<c.length) {
                System.out.print(c[j]);
                j+=2;
            }
            System.out.print(" ");
            while (k<c.length) {
                System.out.print(c[k]);
                k+=2;
            }
            System.out.println("");
        }
        op.close();
    }
}
