public class fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2  = 1, num3;
        System.out.print(num1+"\n"+num2);

        for (int i = 2; i < 20; i++) {
            num3 = num1+num2;
            System.out.print("\n"+num3);
            num1=num2; num2=num3;
        }
    }
}
