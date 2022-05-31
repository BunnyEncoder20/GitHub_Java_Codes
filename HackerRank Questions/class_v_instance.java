import java.util.*;

class person{
    int age;
    person(int initialAge){
        if (initialAge<0) {
            System.out.println(" Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    void yearPasses(){
        this.age++;
    }

    void amIOld(){
        if (this.age<13) {
            System.out.println("You are young.");
        }
        else if (this.age>12 && this.age<18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
    }
}

/**
 * class_v_instance
 */
public class class_v_instance {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int test_cases = op.nextInt();

        for (int i = 0; i < test_cases; i++) {
            int init_age = op.nextInt();
            person man = new person(init_age);
            man.amIOld();
            for (int j = 0; j < 3; j++) {
                man.yearPasses();
            }
            man.amIOld();
            System.out.println("");
        }

        op.close();
    }
}