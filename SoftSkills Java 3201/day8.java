/*
 *  Conditional statements
 *  if - else 
 *  Nested if - else
 *  if - else if - else
 *  
 *  We cannot keep typing if - else for all the conditons so we use so we go for switch
 *  Expression can be of the type byte, short, int, char, enumeration (char or char with a number)
 *  Switch key can be a expression and so can the values in the cases
 */

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        // int x=10;
       
        // if (true) {
        //     continue;          //this gives a error because break cannot be used inside a for loop
        //     break;               //break and continue can only be used inside loops
        // }

        Scanner op = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = op.nextInt();

        

        if (year%100==0) {
            if(year%400==0)
                System.out.println("This is a leap year!");
            else{
                System.out.println("This is NOT a leap year!");
            }
        } else if(year%4==0) {
            System.out.println("This is a leap year!");
        }
        else{
            System.out.println("This is NOT a leap year!");
        }

        op.close();
    }
}
