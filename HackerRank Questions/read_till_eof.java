import java.util.*;



public class read_till_eof {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output 
        to STDOUT. Your class should be named Solution. */
        Scanner op = new Scanner(System.in);
        int next = 0;

        while (op.hasNext()) {  //op.hasNext() checks if there is a new line in the next line (not current one)
            System.out.println(++next + " " +op.nextLine());
        }
        //use ctrl+z to make eof character in console
        op.close();
    }
}
