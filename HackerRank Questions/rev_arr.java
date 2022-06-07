import java.util.Scanner;

public class rev_arr {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        int size = op.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = op.nextInt();
        }

        for (int i = size-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        
        op.close();
    }
}
