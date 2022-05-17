public class mul_overloading {

    public static int MyMultiplication(int num1, int num2)
    {
        return num1*num2;
    }

    public static double MyMultiplication(double num1, double num2)
    {
        return num1*num2;
    }

    public static void MyMultiplication(complex num1, complex num2)
    {
        int result_part1 = (num1.real*num2.real - num1.imaginary*num2.imaginary);
        int result_part2 = (num1.real*num2.imaginary + num1.imaginary*num2.real);
        System.out.print("\nMultiplication of Complex : "+result_part1+"+ i"+result_part2);
    }

    public static void main(String[] args) {
        System.out.print("\nMultiplication of Ints : "+MyMultiplication(2,5));
        System.out.print("\nMultiplication of Floats : "+MyMultiplication(2.2,5.5));

        complex complex_number1 = new complex();
        complex complex_number2 = new complex();
        complex_number1.set_complex("1+7i");
        complex_number2.set_complex("1+8i");
        MyMultiplication(complex_number1,complex_number2);
    }
}

class complex extends mul_overloading{
    public  int real,imaginary;

    public void set_complex(String n)
    {
        String real = n.substring(0,n.indexOf("+"));
        String imaginary = n.substring(n.indexOf("+")+1,n.length()-1);

        this.real = Integer.parseInt(real);
        this.imaginary = Integer.parseInt(imaginary);
    }
}
