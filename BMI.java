import java.util.*;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        //System.out.println("Enter the Last Name:");

        System.out.println("Enter the Weight(in kg):");
        double weight = sc.nextDouble();
        System.out.println("Enter the Height(in m):");
        double height = sc.nextDouble();

        bmi_method(name, height, weight);

        sc.close();
    }

    static void bmi_method(String name, double height, double weight){

        double bmi = weight/(height*height);
        if (bmi<18.5) {
            System.out.println("\n\n"+name+" : Underweight");
            System.out.println("BMI : "+String.format("%.5f", bmi));
        } else {
            if (18.5<bmi && bmi<=25) {
                System.out.println("\n\n"+name+" : Normal");
                System.out.println("BMI : "+String.format("%.5f", bmi));
            } else {
                if (25<bmi && bmi<30) {
                    System.out.println("\n\n"+name+" : Overweight");
                    System.out.println("BMI : "+String.format("%.5f", bmi));
                } else {
                    System.out.println("\n\n"+name+" : Obese Class");
                    System.out.println("BMI : "+String.format("%.5f", bmi));
                }
            }
        }


    }
}
