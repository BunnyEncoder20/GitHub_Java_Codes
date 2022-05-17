public class prime {
    public static void main(String[] args) {
        int num=13; boolean flag=true;

        if (num==0||num==1) {
        
        } else {
            for (int i = 2; i <= num/2 ; i++) {
                if (num%i==0) {
                    System.out.print("\nThe number is not a prime number\n\n");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print("\nThe number is a Prime number!\n\n");
            }
        }
    }
}
