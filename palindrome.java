import java.util.Scanner;
public class palindrome {

    static void chk_palindrome(String str)
    {
        char[] original = str.toCharArray();    //.toCharArray() converts the string into character array
        String reverse = "";                        //string to hold reverse of original 

        for (int i = original.length-1; i >=0; i--) {
            reverse += original[i];              //using reverse iteration generating reverse string 
        }
        
        if (str.equals(reverse)) {
            System.out.print("\nThe given string is a palindrome !\n\n");
        }
        else{
            System.out.print("\nThe given string is not a palindrome!\n\n");
        }
    }

    public static void main(String[] args) {
        
        Scanner op = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = op.nextLine();
        chk_palindrome(str) ; 

        op.close();
    }
}
