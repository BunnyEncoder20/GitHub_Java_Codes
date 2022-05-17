import java.util.Scanner;
import primespackage.Primes;

public class Twin_primes {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Primes chk = new Primes();

        System.out.print("Enter the range:\nFrom : ");
        int from = op.nextInt();
        System.out.print("To : ");
        int to = op.nextInt();

        for (int i = from; i <to-1; i++) {

            //System.out.print(i);

            if (i==from) {
                if(chk.check_prime(i))
                {
                    int potential_twin = i+2;
                    if (chk.check_prime(potential_twin)) {
                        System.out.print("\n("+i+","+potential_twin+")");
                    }
                }
            }

            else{
                if(chk.check_prime(i))
                {
                    int potential_twin1 = i+2; 

                    if (chk.check_prime(potential_twin1)) {
                        System.out.print("\n("+i+","+potential_twin1+")");
                    }

                }
            }
        }

        op.close();
    }
}
