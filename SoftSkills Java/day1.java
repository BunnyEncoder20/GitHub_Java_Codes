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
        System.out.printf("Hello World\n"); //used for format specifiers like %d,%f,%ln,etc
        System.out.println("Hello World");  //cursor on the next line after printing
        System.out.print("Hello World\n");    //cursor on the same line after printing 

        //The class function obviously needs a object to access the function
        day1 obj = new day1(); //new keyword is used to allocate memory for class object
        
        obj.function();
    }
}