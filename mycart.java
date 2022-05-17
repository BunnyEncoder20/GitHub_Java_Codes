import java.util.Scanner;
class employees{
        
    protected int emp_id,AGP,DA,HRA,TA;
    protected String emp_desig;
    protected double basic_pay;
    protected double salary;

    public void set_data(int id,String desig,double pay)
    {
        this.emp_id = id;
        this.emp_desig = desig;
        this.basic_pay = pay;
        AGP = 10000; DA = 5000; TA = 15000; HRA = 20000;
        this.salary = 0;
    }

    // public void set_computed_sal(double sal)
    // {
    //     this.salary = sal;
    // }
}

class project_managers extends employees{

    public void set_data()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Employee id : ");
        int id = in.nextInt();
        String desig = "Project Manager";
        double pay = 200000;

        employees myemp = new employees();
        myemp.set_data(id, desig, pay);
        Compute_Salary(myemp);
        in.close();
    }

    public void Compute_Salary(employees myemp)
    {
        myemp.salary = myemp.basic_pay+myemp.AGP+myemp.DA+myemp.HRA;
        Display_data(myemp);
    }

    public void Display_data(employees myemp)
    {
        System.out.print("\n\nEmployee ID : " +myemp.emp_id);
        System.out.print("\nDesignation : " +myemp.emp_desig);
        System.out.print("\nBasic Pay : " +myemp.basic_pay);
        System.out.print("\nSalary : " +myemp.salary);
    }
}

class system_managers extends employees{

    public void set_data()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Employee id : ");
        int id = in.nextInt();
        String desig = "System Manager";
        double pay = 80000;

        employees myemp = new employees();
        myemp.set_data(id, desig, pay);
        Compute_Salary(myemp);
        in.close();
    }

    public void Display_data(employees myemp)
    {
        System.out.print("\n\nEmployee ID : " +myemp.emp_id);
        System.out.print("\nDesignation: " +myemp.emp_desig);
        System.out.print("\nBasic Pay : " +myemp.basic_pay);
        System.out.print("\nSalary : " +myemp.salary);
    }

    public void Compute_Salary(employees myemp)
    {
        myemp.salary = myemp.basic_pay+myemp.TA;
        Display_data(myemp);
    }
}

class tech_assistance extends employees{
    public void set_data()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Employee id : ");
        int id = in.nextInt();
        String desig = "Technical Assistance";
        double pay = 10000;

        employees myemp = new employees();
        myemp.set_data(id, desig, pay);
        Compute_Salary(myemp);
        in.close();
    }

    public void Display_data(employees myemp)
    {
        System.out.print("\n\nEmployee ID : " +myemp.emp_id);
        System.out.print("\nDesignation: " +myemp.emp_desig);
        System.out.print("\nBasic Pay : " +myemp.basic_pay);
        System.out.print("\nSalary : " +myemp.salary);
    }

    public void Compute_Salary(employees myemp)
    {
        myemp.salary = myemp.basic_pay;
        Display_data(myemp);
    }
}


public class mycart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Designation : ");
        String desig = in.nextLine();

        if (desig.equals("project manager")) {
            project_managers new_emp = new project_managers();
            new_emp.set_data();
        }
        else if (desig.equals("system manager")) {
            system_managers new_emp = new system_managers();
            new_emp.set_data();
        }
        else if(desig.equals("tech assistance"))
        {
            tech_assistance new_emp = new tech_assistance();
            new_emp.set_data();
        }
        in.close();
    }
}