package package2;
import java.util.Scanner;

public class studentdetails_class {
    public String name;
    public String reg_num;
    public String subject;
    public int marks;

    public void set_details(String name, String r_num, String sub, int mark)
    {
        this.name = name;
        this.reg_num = r_num;
        this.subject = sub;
        this.marks = mark;
        this.marks = mark;
    }

    public void display()
    {
        System.out.print("Student Name : " + name);
        System.out.print("Registration Number : " + reg_num);
        System.out.print("Subject : " + subject);
        System.out.print("Marks : " + marks);
    }

    public void display(studentdetails_class studs[])
    {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter your registration number : ");
        String chk_reg = op.nextLine();

        for (int i = 0; i < studs.length; i++) {
            if (studs[i].reg_num.equals(chk_reg)) {
                System.out.print("\n\nStudent Name : "+studs[i].name);
                System.out.print("\nRegistration Number : "+studs[i].reg_num);
                System.out.print("\nSubject : "+studs[i].subject);
                System.out.print("\nMarks : "+studs[i].marks);
            }
        }
        op.close();
    }

}
