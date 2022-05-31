import java.util.*;

public class primitive_datatypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
        Print output to STDOUT. Your class should be named Solution. */
        Scanner op = new Scanner(System.in);

        int test_cases = op.nextInt();
        for (int i = 0; i < test_cases; i++) {

            try {
                long input = op.nextLong();
                System.out.println(input+" can be fitted in:");
                if ( -(Math.pow(2,7)) <= input && input <= (Math.pow(2,7))-1)
                    System.out.println("* byte");
                if (-(Math.pow(2,15)) <= input && input <= (Math.pow(2,15)-1))
                    System.out.println("* short");
                if (-(Math.pow(2,31)) <= input && input <= (Math.pow(2,31)-1))
                    System.out.println("* int");
                if (-(Math.pow(2,63)) <= input && input <= (Math.pow(2,63)-1))
                    System.out.println("* long");

            } 
            catch (Exception e) {
                System.out.println(op.next()+" can't be fitted anywhere.");
                //op.next() will print the last input. 
                //Hence if a value which cannot be stored in the long
                //is given as input, then it'll give the input still here
            }
        }

        op.close();
    }
}