//write code for checking kaprekar numbers
/*
 * 45^2 = 2025
 * 20+25 = 45
 * 
 * n=user input
 * sq = n*n
 * get length of the sq
 * while(sq>0){
 *  sq=sq/10; length++;
 * }
 * 
 * power=1
 * while(power<length-1)
 * {
 *  tempQ = temp/pow(10,power);
 *  tempR = temp%pow(1o,power);
 *  if(tempQ+tempR == n){
 *      printf("Capricon Number");
 *      break;
 *  }
 *  else{ continue;}
 * }
 */
import java.util.Scanner;

public class day12pt2 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = op.nextInt();
        int nxn = n*n;
        
        String sq = String.valueOf(nxn); //used to convert INT to STRING
        int power=1; int tempQ,tempR;
        while (power<sq.length()-1) {
            tempQ = tempQ/pow(10,power);
            tempR = tempR%pow(10,power);
        }
        op.close();
    }
}
