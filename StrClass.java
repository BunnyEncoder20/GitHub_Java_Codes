import java.util.Scanner;

public class StrClass{
   public static void main(String args[]) {
        Scanner op=new Scanner(System.in);
        int sumlen;    // the sum length of str1 and the length of str2

        System.out.println("Enter a string A: ");
        String str1=op.next();
        System.out.println("Enter a string B: ");
        String str2=op.next();

       
       sumlen = str1.length() + str2.length();
       System.out.println("\n\nSum of the string lengths = "+sumlen);

      //  System.out.print(str1.compareTo(str2));
       if(str1.compareTo(str2)<0){
        System.out.println("Yes, str2 comes after str1");
       }
       else{
        System.out.println("No, str1 comes after str2");
       };

       System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+"  "+
                                       str2.substring(0,1).toUpperCase()+str2.substring(1));
       op.close();
   }
}
