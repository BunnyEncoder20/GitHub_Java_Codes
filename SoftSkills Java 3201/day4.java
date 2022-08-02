/* 
 * CLASSES AND OBJECTS 
 *   
 *  classes can have attributes (variables) & behaviours (method)
 *  to access class attributes and methods, we need a object (real time entity)
 *  object creation : class_name obj = new class_name();
 *  the 2nd class_name() is actually the constructor of the class
 */


public class day4 {
    public static void main(String[] args) {
        byte i = 10;
        byte j = 20;
        // byte k = i+j; causes error because the JVM doesn't perform any operations on byte data types. So if we do some operation it'll convert the bytes into integers and then do the operation
        byte k = (byte) (i+j);
        System.out.println(k);

        //this line will print the SUM of the ASCII values (example of widened - i.e. )
        System.out.println('j'+'a'+'v'+'a');
        
        // if(true)
        //     break;
        /*this lines gives an error because the break,continue statements can only be used inside of a loop */
    }
}
