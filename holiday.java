import java.util.Scanner;

class national_holiday{
    private String name;
    private int day;
    private String month;

    public national_holiday(String nam, int dd, String mm)
    {
        this.name = nam;
        this.day = dd;
        this.month = mm;
    }

    public String get_name()
    {
        return name;
    }
    public int get_day()
    {
        return day;
    }
    public String get_month()
    {
        return month;
    }

    public boolean InSamMonth(national_holiday h2)
    {
        return this.get_month().equals(h2.get_month());   //str1.equals(str2) compares 2 strings and return boolean true false 
    }
}

public class holiday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nam,mm; int dd; String LeftOverStringInput;

        //making instance for Gandhi Jayanthi,02 Oct 
        nam = "Gandhi Jayanthi"; dd = 02; mm = "October";
        national_holiday newHoliday = new national_holiday(nam, dd, mm);
        System.out.print("Class Instance Created!\n");
        System.out.print("\nHoliday Name : "+newHoliday.get_name());
        System.out.print("\nHoliday date : "+newHoliday.get_day());
        System.out.print("\nHoliday Month : "+newHoliday.get_month());

        System.out.print("\n\nEnter 2 holidays :\n");
        System.out.print("\nEnter Name 1 : ");
        nam = in.nextLine();
        System.out.print("\nEnter date 1 : ");
        dd = in.nextInt();
        LeftOverStringInput = in.nextLine(); //consumes the \n leftover by the in.nextInt() cause this does not take \n which will get carried over to the next input nextline()
        System.out.print("\nEnter Month 1 : ");
        mm = in.nextLine();
        national_holiday myholiday1 = new national_holiday(nam, dd, mm);
        System.out.print("\n\nEnter Name 2 : ");
        nam = in.nextLine();
        System.out.print("\nEnter date 2 : ");
        dd = in.nextInt();
        LeftOverStringInput = in.nextLine();
        System.out.print("\nEnter Month 2 : ");
        mm = in.nextLine();
        national_holiday myholiday2 = new national_holiday(nam, dd, mm);

        if (myholiday1.InSamMonth(myholiday2)) {
            System.out.print("\n\nThe 2 holidays ARE in the same month!");
        }
        else
        {
            System.out.print("\n\nThe 2 holidays are NOT in the same month!");
        }
        in.close();
    }
}
