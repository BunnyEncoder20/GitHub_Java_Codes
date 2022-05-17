import java.util.*;
public class Rtriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps :\n");
        int count = sc.nextInt();
        System.out.print("Enter your choice :\n1) *\n2) @\n3) &\n4) #\n5) |\n\nChoice : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                printtriangle("*",count);
                break;
            case 2 :
                printtriangle("@",count);
                break;
            case 3 :
                printtriangle("&",count);
                break;
            case 4 :
                printtriangle("#",count);
                break;
            case 5 :
                printtriangle("|",count);
                break;

            default:
                System.out.print("Wrong choice aborting");
                break;
        }

        sc.close();
    }

    static void printtriangle(String str,int count){
        for (int i = 0; i < count; i++) {   //rows
            for (int j = 2*(count-i); j >= 0; j--) {
                System.out.print(" ");      //spaces
            }
            for (int j2 = 0; j2 <= i; j2++) {   
                System.out.print(str+" ");  //stars
            }
            System.out.println();       //put to newline after finishing printing a row
        }
    }
}
