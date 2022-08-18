// Looping Statement
/*
 * for, while,  do while,  enchanced for
 * 
 * For loop 
 * for(initial condition; testing condition; increment/decrement)
 * {  code block }
 * 
 * While(condition)
 * { code block }
 * in while loop, the initialization, the condition and the  increment/decrement are in seperate lines
 * if we do not know the number of iteration required we can use while
 * while is a entry checking loop
 * 
 * do
 * { 
 *      code block
 * } while (conditions)
 * do while is a exit checking loop
 * 
 * Enchanced for loop
 * for(String iterative_variable : array/string)
 * { code block;}
 */
public class day10 {
    public static void main(String[] args) {
        //regular for
        for (int i = 2; i <= 4; i++) {
            System.out.println("Value of i = " + i);
        }

        //enchanced for
        String str[] = {"varun","soma","bunny","somya"};
        for (String i : str) {
            System.out.println(i);
        }
        
        int array[]={1,2,3,4,5,6,7,8,9,10};

        //if no braces then only the next line will be considered insdie the for loop
        for(int i:array)
            System.out.println("value of i x 100 = "+i*100);
    }
}
