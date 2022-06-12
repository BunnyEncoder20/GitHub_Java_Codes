import java.util.Scanner;

public class int_2_bin {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int i = op.nextInt();

        //Integer.toBinaryString(int n) takes integer input and return String bianry of the integer 
        String binaryStr = Integer.toBinaryString(i);
        System.out.println("Binary = " + binaryStr);

        //here we made a String array with splits the binary number into parts of consecutive ones. The longest string will have the maximum ones init 
        String[] consecutive_ones = binaryStr.split("0");

        int maxi = 0;
        for (int j = 0; j < consecutive_ones.length; j++) {
            if (consecutive_ones[j].length()>maxi) {
                maxi = consecutive_ones[j].length();
            }
        }

        System.out.println(maxi);
        op.close();
    }
}
