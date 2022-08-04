import java.util.Scanner;

class Calculator{
    int power(int n, int p){
        return (int)Math.pow(n, p);
    }
}

class negative_num_exception extends Exception{
    negative_num_exception(){
        super();
    }
}

public class day17 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Calculator obj = new Calculator();
        int testcases = op.nextInt();

        for (int i = 0; i < testcases; i++) {
            int n = op.nextInt();
            int p = op.nextInt();

            try {
                check_num(n, p);    
                System.out.println(obj.power(n, p));
            } catch (Exception e) {
                System.out.println("n and p should be non-negative.");
            }
        }

        op.close();
    }

    public static void check_num(int n, int p) throws negative_num_exception{ 
        if (n<0 || p<0) {
            throw new negative_num_exception();
        }
    }
}
