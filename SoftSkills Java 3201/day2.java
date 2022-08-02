import java.util.Scanner;   //method 1 to get user input
import java.io.BufferedReader;   //method 2 to get user input

public class day2 { 
    //generally, class name should start with capital
    //there should be no space in the class name

    static void display()
    {
        System.out.println("Static method doesn't need a object");
    }
    public static void main(String[] args) {
        //main method
        //static means there is no need to make object of main method
        //string args is the arguments sent from the terminal input
        display();
        day2.display();
        System.out.print("Returns void\n"); //if(system.out,print()) will give an error
        System.out.println("Returns void"); //if(system.out.println()) will also give error 
        System.out.printf("Returns int\n"); //if(system.out.printf("Hello")==null) will not give error but will not enter the if block
    }
}


