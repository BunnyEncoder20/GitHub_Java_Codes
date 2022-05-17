package primespackage;

public class Primes {
    public boolean check_prime(int num)
    {
        int divide = num/2;

        if (num==0 || num==1) {
            return false;
        }
        else
        {
            for (int i = 2; i <= divide; i++) {
                if (num%i==0) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
