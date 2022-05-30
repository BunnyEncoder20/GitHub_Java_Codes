import java.io.*;
import java.util.*;


class not_positive_exception extends Exception{
    not_positive_exception(String msg){
        super(msg);
    }
}

public class exception {
    static Scanner op = new Scanner(System.in);
    static int b = op.nextInt();
    static int h = op.nextInt();
    public static void main(String[] args) {
        
        try {
            chk(b,h);
            System.out.println(b*h);
        } catch (not_positive_exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static boolean chk(int b, int h) throws not_positive_exception{
        if (b<0 || h<0) {
            throw new not_positive_exception("not positive");
        }
        else
            return true;
    }
}
