public class chkamstrong {
    public static void main(String[] args) {
        int original_num=407,sum=0; boolean result;
        int temp=original_num;

        while (temp!=0) {
            sum+=Math.pow(temp%10,3);
            temp/=10;
        }

        result = original_num==sum?true:false;

        if (result) {
            System.out.print("\nThe Number IS a Amstrong number!\n\n");
        }
        else{
            System.out.print("\nThe Number is NOT a Amstrong number!\n\n");
        }
    }
}
