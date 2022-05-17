//Q4
public class Circle_perimeter {
    public static void main(String[] args){
        double area_of_circle = 78.5;
        System.out.println("The are of the circle is = "+area_of_circle+"\n");

        double radius = Math.sqrt(area_of_circle/3.14);
        double perimeter = 2*3.14*radius;

        System.out.println("Radius of the circle : "+radius);
        System.out.println("\nCircumference of the circle : "+String.format("%.2f",perimeter));
    }
}
