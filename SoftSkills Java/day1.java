import java.util.function.Function;

/**
 * day1
 */
public class day1 {
    void function()
    {
        System.out.println("This is the void function");
    }
    public static void main(String[] args) {
        System.out.printf("Hello World"); //used for format specifiers like %d,%f,%ln,etc
        System.out.print("Hello World");    //cursor on the same line after printing 
        System.out.println("Hello World");  //cursor on the next line after printing

        day1 obj = new day1(); //new keyword is used to allocate memory for object
        obj.function();
    }
}