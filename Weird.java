//Q5
public class Weird {
    public static void main(String[] args) {
        int number = 8;
        if (number%2!=0) {  //number is odd
            System.out.println("\nWeird\n");
        }
        else{       //else number is even
            if (2<=number && number<=5) {
                System.out.println("\nNot Weird\n");
            } 
            else {
                if (6<=number && number<=20) {
                    System.out.println("\nWeird\n");
                } 
                else {
                    if (20<=number) {
                        System.out.println("\nNot Weird\n");
                    }
                    else{
                        System.out.println("\nNumber not is specified range!\n");
                    }
                }
            }
        }
    }
}
