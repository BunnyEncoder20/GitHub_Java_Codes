package package1;
import java.util.Scanner;

public class hosteldetails_class {
    public String hostel_name;
    public int block_number;
    public int num_of_rooms;    
    Scanner op = new Scanner(System.in);

    public void make_hostels(String h_name, int b_num) {
        this.hostel_name = h_name;
        this.block_number = b_num;
        this.num_of_rooms = 50;
    }

    public void display(hosteldetails_class hostels[]) {
        
        for(int i = 0 ; i<hostels.length; i++)
        {
            System.out.print("\n\nHostel Name : " + hostels[i].hostel_name);
            System.out.print("\nBlock Number : " + hostels[i].block_number);
            System.out.print("\nNumber of rooms : " + hostels[i].num_of_rooms);
        }
        // System.out.print("Hostel Name : " + hostel_name);
        // System.out.print("Block Number : " + block_number);
        // System.out.print("Number of rooms : " + num_of_rooms);
    }

    public void change_hostel(hosteldetails_class hostels[])
    {
        

        System.out.print("Enter the current Hostel name : ");
        String curr_hostel = op.nextLine();
        System.out.print("Enter the current Hostel block : ");
        int curr_block = op.nextInt();

        System.out.print("Enter the new Hostel name : ");
        String new_hostel = op.nextLine();
        System.out.print("Enter the new Hostel block : ");
        int new_block = op.nextInt();

        for (int i = 0; i < hostels.length; i++) {
            if (hostels[i].hostel_name.equals(curr_hostel) && hostels[i].block_number == curr_block) {
                
                System.out.print("Vaccated Hostel : " + hostels[i].hostel_name);
                System.out.print("Vaccated Hostel Block : " + hostels[i].block_number);
                System.out.print("Number of Rooms : " + hostels[i].block_number);
                hostels[i].num_of_rooms++;
                System.out.print("New vaccant rooms : " + hostels[i].block_number);
            }
        }

        for (int i = 0; i < hostels.length; i++) {
            if (hostels[i].hostel_name.equals(new_hostel) && hostels[i].block_number == new_block) {
                
                System.out.print("New Hostel : " + hostels[i].hostel_name);
                System.out.print("New Hostel Block : " + hostels[i].block_number);
                System.out.print("Number of Rooms : " + hostels[i].block_number);
                hostels[i].num_of_rooms--;
                System.out.print("New vaccant rooms : " + hostels[i].block_number);
            }
        }
        op.close();
    }


    public void get_rooms(hosteldetails_class hostels[])
    {
        System.out.print("Enter the Hostel name : ");
        String chk_hostel = op.nextLine();
        System.out.print("Enter the Hostel Block : ");
        int chk_block = op.nextInt();

        for (int i = 0; i < hostels.length; i++) {
            if (hostels[i].hostel_name.equals(chk_hostel) && hostels[i].block_number == chk_block) {
                System.out.print("Vaccant Rooms : " + hostels[i].num_of_rooms);
            }
        }
    } 
}