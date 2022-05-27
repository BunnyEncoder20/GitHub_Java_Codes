import java.util.Scanner;

public class stdin_stdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        // int i = scan.nextInt();
        double d = scan.nextDouble();
        String cat = scan.nextLine();       //to preven the blank input in the nextline, place a nexLine() function above that input
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}

