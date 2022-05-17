//Q3
public class Sum_bin {
    public static void main(String[] args){
        //System.out.println(1010%10);

        long binary_num1 = 10011011;
        long binary_num2 = 10110000;
        int carry = 0; int i=0;
        long[] sum = new long[9];

        System.out.println("\nBinary 1 :   "+binary_num1);
        System.out.println("Binary 2 :   "+binary_num2);
        System.out.println("-----------------------");

        while (binary_num1!=0 && binary_num2!=0) {
            int digit1 = (int)binary_num1%10;
            int digit2 = (int)binary_num2%10;

            if (digit1==0 && digit2==0) {
                if (carry==0) {     //0+0+0
                    sum[i++]=0; carry=0;
                } else {           //0+0+1
                    sum[i++]=1; carry=0;
                }
            } 
            else {
                if ((digit1==1 && digit2==0)||(digit1==0 && digit2==1)) {
                    if (carry==0) {     //1+0+0
                        sum[i++]=1; carry=0;
                    } else {            //1+0+1
                        sum[i++]=0; carry=1;
                    }
                } 
                else {
                    if (digit1==1 && digit2==1) {
                        if (carry==0) {     //1+1+0
                            sum[i++]=0; carry=1;
                        } else {            //1+1+1
                            sum[i++]=1; carry=1;
                        }
                    }
                }    
            }
            binary_num1/=10;
            binary_num2/=10;
        }
        if (carry!=0) {
            sum[i] = carry;
        }
        System.out.print("Binary Sum: ");
        while (i>=0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }

    
}
