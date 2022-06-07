import java.util.*;


// class not_positive_exception extends Exception{
//     not_positive_exception(String msg){
//         super(msg);
//     }
// }

public class exception {
    static Scanner op = new Scanner(System.in);
    static int b = op.nextInt();
    static int h = op.nextInt();
    static boolean flag = true;

    static{
        try {
            if (b<=0 || h<=0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area = b*h;
            System.out.println(area);
        }
    }
}
