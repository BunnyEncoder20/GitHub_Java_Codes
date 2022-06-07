import java.util.Scanner;

public class convert_to_str {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        String s = ""+n;
        
        if(Integer.parseInt(s)==n){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
