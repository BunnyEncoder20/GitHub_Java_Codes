public class employee_test {
    public static class Employee{
        private String First_name,Last_name;
        private double monthly_salary;

        public Employee()
        {
            First_name = "First Name here";
            Last_name = "Last Name here";
            monthly_salary = 0.0;
        }

        // setters
        public void set_First_name(String f_name)
        {
            this.First_name = f_name;
        }

        public void set_Last_name(String l_name)
        {
            this.Last_name = l_name;
        }

        public void set_monthly_salary(double salary)
        {
            if (salary<0)
                salary = 0.0;
            this.monthly_salary = salary;
        }

        //getters
        public String get_First_name()
        {
            return this.First_name;
        }

        public String get_Last_name()
        {
            return this.Last_name;
        }

        public double get_monthly_salary()
        {
            return this.monthly_salary;
        }

        //required method:
        public double get_yearly_salary()
        {
            return this.monthly_salary*12;
        }
    }


    public static void main(String[] args) {
        Employee Varun = new Employee();
        Employee Soma = new Employee();

        // setting values
        Varun.set_First_name("Varun");  Soma.set_First_name("Somya");
        Varun.set_Last_name("Verma");   Soma.set_Last_name("Kumari");
        Varun.set_monthly_salary(50000);    Soma.set_monthly_salary(200000);

        //printing values 
        System.out.print("\n\nEmployee 1\n");
        System.out.print("\nFirst Name : "+Varun.get_First_name());
        System.out.print("\nLast Name : "+Varun.get_Last_name());
        System.out.print("\nMonthly Salary : "+Varun.get_monthly_salary());
        System.out.print("\nAnual Package : "+Varun.get_yearly_salary());

        System.out.print("\n\nEmployee 2\n");
        System.out.print("\nFirst Name : "+Soma.get_First_name());
        System.out.print("\nLast Name : "+Soma.get_Last_name());
        System.out.print("\nMonthly Salary : "+Soma.get_monthly_salary());
        System.out.print("\nAnual Package : "+Soma.get_yearly_salary());

        //10% raise after :
        Varun.set_monthly_salary(Varun.get_monthly_salary()+(0.1*Varun.get_monthly_salary()));
        Soma.set_monthly_salary(Soma.get_monthly_salary()+(0.1*Soma.get_monthly_salary()));

        //printing the value again
        System.out.print("\n\n\nAfter 10% raise in salary:\n");
        System.out.print("\n\nEmployee 1\n");
        System.out.print("\nName : "+Varun.get_First_name()+" "+Varun.get_Last_name());
        System.out.print("\nMonthly Salary : "+Varun.get_monthly_salary());
        System.out.print("\nAnual Package : "+Varun.get_yearly_salary());

        System.out.print("\n\nEmployee 2\n");
        System.out.print("\nName : "+Soma.get_First_name()+" "+Soma.get_Last_name());
        System.out.print("\nMonthly Salary : "+Soma.get_monthly_salary());
        System.out.print("\nAnual Package : "+Soma.get_yearly_salary());
    }
}
