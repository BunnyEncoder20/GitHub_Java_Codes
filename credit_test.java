import java.util.Scanner;

class credit_card{
    public long    credit_card_num;
    public String customer_name;
    public String   phone_number;
    public String expiry_date;
    public String email_id;
    public double credit_limit;
    public boolean tricard_credit = false;
    public boolean bicard_credit = false;

    public credit_card(long card_num, String name, String number, String expiry, String mail, double limit)
    {
        this.credit_card_num = card_num;
        this.customer_name = name ;
        this.phone_number = number ; 
        this.expiry_date = expiry ;
        this.email_id = mail;
        this.credit_limit = limit;
    }
} 

public class credit_test {
    static int size = 9;
    public static void main(String[] args) {
        // long card_num;
        // String name,expiry,mail,number;
        // double limit;
        

        System.out.print("Details of 5 cards Entered successfully\n");

        credit_card customer_list[] = new credit_card[size]; //making array of object of size 5
        customer_list[0] = new credit_card(1001, "Varun", "9856235471", "05/25", "bunny_encoder@gmail.com", 50000);
        customer_list[1] = new credit_card(1002, "Varun", "9856235471", "14/30", "bunny_encoder@gmail.com", 50000);
        customer_list[2] = new credit_card(1003, "Varun", "9856235471", "12/22", "bunny_encoder@gmail.com", 50000);
        customer_list[3] = new credit_card(1004, "Varun", "9856235471", "01/31", "bunny_encoder@gmail.com", 50000);
        customer_list[4] = new credit_card(1005, "Tarun", "9885486715", "23/29", "tearun_puneet007@gmail.com", 50000);
        customer_list[5] = new credit_card(1006, "Soma", "9855664475", "20/23", "soma_senpai2020@gmail.com", 50000);
        customer_list[6] = new credit_card(1007, "Soma", "9855664475", "11/33", "soma_senpai2020@gmail.com", 50000);
        customer_list[7] = new credit_card(1008, "Hooda", "9978656685", "03/24", "haryanvi_seal69@gmail.com", 50000);
        customer_list[8] = new credit_card(1009, "Bunnu", "9988985685", "12/27", "bunnuprasand404@gmail.com", 50000);

        display_customer_list(customer_list);
        same_mobile_number(customer_list);
        increase_creditLimit(customer_list);
    }

    static void display_customer_list(credit_card customer_list[])
    {
        for (int i = 0; i < size; i++) {
            System.out.print("\n\nCard Number : " + customer_list[i].credit_card_num);
            System.out.print("\nName : " + customer_list[i].customer_name);
            System.out.print("\nPhone Number : " + customer_list[i].phone_number);
            System.out.print("\nExpiry date : " + customer_list[i].expiry_date);
            System.out.print("\nEmail_id : " + customer_list[i].email_id);
            System.out.print("\nCredit Limit : " + customer_list[i].credit_limit);
        }
    } 

    static void same_mobile_number(credit_card customer_list[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nEnter the Number to be searched : ");
        String number = in.nextLine();

        for (int i = 0; i < size; i++) {
            if (customer_list[i].phone_number.equals(number)) {
                System.out.print("\n\nName : "+customer_list[i].customer_name);
                System.out.print("\nCard Number : "+customer_list[i].credit_card_num);
                System.out.print("\nPhone Number : "+customer_list[i].phone_number);
            }
        }
        in.close();
    }

    static void increase_creditLimit(credit_card customer_list[])
    {
        // boolean tricards_cutomer = false;
        // boolean bicards_cutomer = false;

        for (int i = 0; i < size; i++) {
            int count = 0,k=0;
            int indexes[] = new int[5];

            for (int j = 0; j < size; j++) 
            {
                if (customer_list[i].customer_name.equals(customer_list[j].customer_name)) 
                {
                    ++count; 
                    indexes[k++]=j; 
                }
            }

            if (count>1 && !customer_list[i].bicard_credit)
            {
                for (int l = 0; l < indexes.length; l++) 
                {
                    customer_list[indexes[l]].credit_limit+=20000;
                    customer_list[indexes[l]].bicard_credit = true;
                }
            }

            if (count>3 && !customer_list[i].tricard_credit)
            {
                for (int l = 0; l < indexes.length; l++) 
                {
                    customer_list[indexes[l]].credit_limit+=50000;
                    customer_list[indexes[l]].tricard_credit = true;
                }
            }
        }
        System.out.print("\n\nCredit limit increasing successfull\nDisplaying results :");
        short_display_customer_list(customer_list);
    }
  
    static void short_display_customer_list(credit_card customer_list[])
    {
        for (int i = 0; i < size; i++) {
            System.out.print("\n\nCard Number : " + customer_list[i].credit_card_num);
            System.out.print("\nName : " + customer_list[i].customer_name);
            System.out.print("\nCredit Limit : " + customer_list[i].credit_limit);
        }
    }
}