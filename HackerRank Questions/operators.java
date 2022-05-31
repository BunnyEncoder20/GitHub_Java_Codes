import java.io.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double dtip_percent = tip_percent;
        double dtax_percent = tax_percent;
        double tip = meal_cost*(dtip_percent/100); 
        double tax = meal_cost*(dtax_percent/100); 
        double ans = meal_cost + tax + tip;
        // System.out.println(ans);
        
        //Better to use Math.round rather than typecasting the double in a int
        System.out.println((int) Math.round(ans));  
    }

}

public class operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

