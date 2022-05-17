import java.util.Scanner;
public class invoice_test {

    public static class invoice {

        private String part_number,part_description;
        private int quantity; 
        private double price;

        public invoice(){
            //constructor
            this.part_number = "Nothing yet";
            this.part_description = "This also blank";
            this.quantity = 0;
            this.price = 0.0;
        }
        
        //setters
        public void set_part_number(String part_number_val)
        {
            this.part_number = part_number_val;
        }

        public void set_part_description(String part_description_val)
        {
            this.part_description = part_description_val;
        }   
        
        public void set_quantity(int quantity_value)
        {
            if(quantity_value < 0)
                quantity_value = 0; 
            this.quantity = quantity_value;
        } 

        public void set_price(double price_value)
        {
            if(price_value < 0)
                price_value = 0.0; 
            this.price = price_value;
        } 

        //getters
        public String get_part_number()
        {
            return part_number;
        }

        public String get_part_description()
        {
            return part_description;
        }   
        
        public int get_quantity()
        {
            return quantity;
        } 

        public double get_price()
        {
            return price;
        } 


        //methods to calculate price:
        public double getInvoice()
        {
            return quantity*price;
        }
    }

    public static void main(String[] args) {
        invoice object = new invoice();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Part Number : ");
        String part_number = input.nextLine();
        System.out.print("Enter the Part Description : ");
        String part_description = input.nextLine();
        System.out.print("Enter the Quantity : ");
        int quantity = input.nextInt();
        System.out.print("Enter the Price per item : ");
        double price = input.nextDouble();

        //setting the values of invoice class
        object.set_part_number(part_number);
        object.set_part_description(part_description);
        object.set_quantity(quantity);
        object.set_price(price);

        //how the fish these are accessible ???
        // System.out.print("The Part number is : "+object.part_number);
        // System.out.print("\nDescription : \n"+object.part_description);
        // System.out.print("\nThe Quantity ordered : "+object.quantity);
        // System.out.print("\nThe price per part : "+object.price);
        // System.out.print("\nTotal bill amount : "+object.getInvoice());

        System.out.print("\n\n\tInvoice\n");
        System.out.print("\nThe Part number is : "+object.get_part_number());
        System.out.print("\nDescription : \n"+object.get_part_description());
        System.out.print("\nThe Quantity ordered : "+object.get_quantity());
        System.out.print("\nThe price per part : "+object.get_price());
        System.out.print("\nTotal bill amount (Rs): "+object.getInvoice());

        input.close();
    }
}