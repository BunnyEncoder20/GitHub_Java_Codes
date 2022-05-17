import java.lang.Exception;
// import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
            int a = 10, b = 2, c = 0;
            int array[] = new int[5];


            try {
                c = a/b;
                for (int i = 0; i <=5; i++) {
                    array[i]=i+1;
                    System.out.print("\n"+array[i]);
                }
            } 
            catch (ArithmeticException ae) {
                System.out.println("\ncan't divide by zero!");
                System.out.println(ae);
            }
            

            // try{
            //     for (int i = 0; i <=5; i++) {
            //         array[i]=i+1;
            //         System.out.print("\n"+array[i]);
            //     }
            // }
            catch (ArrayIndexOutOfBoundsException ofb) {
                System.out.println("\nArray index out of bounds !");
                System.out.println(ofb);
            }


            System.out.print("\n\nc = "+c);
            System.out.print("//rest of the code");
    }
}
