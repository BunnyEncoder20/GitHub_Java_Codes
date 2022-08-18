import java.util.Scanner;
//print if the character are vowel, consonents or not a letter
public class day9pt2 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        //how to get char input from user charAt(0) takes the first index char
        char ch = op.next().charAt(0);
        
        //remember that when in coolean statements, if we want to access the numberic value, surround the char in single qoutes 

        //if you want to print out the ASCII value of the char, convert it to int and then print the int
        int intch = ch;
        System.out.println(intch);
        
        if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println(ch + " is a vowel !");
        }
        else{
            if ((65<=ch && ch<=90) || (97<=ch || ch<=122)) {
                System.out.println(ch+" is a consonent !");
            }
            else{
                System.out.println(ch+" is a special character !");
            }
        }
        op.close();
    }
}
