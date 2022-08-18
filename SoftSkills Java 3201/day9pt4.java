//calculate profit and lose from cp of dozen banana and sp of 1 banana
import java.util.*;


public class day9pt4 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter Cp of a dozen banana");
        float cp =  op.nextFloat();
        System.out.println("Enter Sp of 1 banana");
        float sp = op.nextFloat();

        if (sp*12>cp) {
            System.out.printf("Profit per Banana : Rs.%.2f",(sp*12-cp)/12);
        }else{
            System.out.printf("Loss per Banana: Rs.%.2f",(cp-sp*12)/12);
        }
        op.close();
    }
}
