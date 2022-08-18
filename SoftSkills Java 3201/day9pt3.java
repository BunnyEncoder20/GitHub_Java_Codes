//grading system for marks entered
import java.util.Scanner;


public class day9pt3 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int marks = op.nextInt();

        if (marks>=90) {
            System.out.println("S grade");
        }else if(80<=marks && marks<90){
            System.out.println("A grade");
        }else if(70<=marks && marks<80){
            System.out.println("B grade");
        }else if (60<=marks && marks<70){
            System.out.println("C grade");
        }else if(50<=marks && marks<60){
            System.out.println("D grade");
        }else if(40<=marks && marks<50){
            System.out.println("E grade");
        }else if(30<=marks && marks<40){
            System.out.println("F grade");
        }else{
            System.out.println("N1 grade");
        }
        op.close();
    }
}
