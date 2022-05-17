import java.util.Scanner;
import package1.*;
import package2.*;

interface school {
    String school_name = "CSE";  
    String school_head = "Rama Chandra Swami";  

    public void display();
}

class school_class implements school
{
    public void display()
    {
        System.out.print("\n\nSchool Name : "+school_name+"\n");
        System.out.print("School Head : "+school_head+"\n");
    }
}


public class hostel {
    public static void main(String[] args) {
        System.out.print("\n\nWelcome to hostel.java\n\n");

        Scanner op = new Scanner(System.in);
        school_class my_sch = new school_class();
        my_sch.display();

        studentdetails_class new_stud[] = new studentdetails_class[20]; int stud_count =0;
        studentdetails_class pack2_obj = new studentdetails_class();
        hosteldetails_class pack1_obj = new hosteldetails_class(); 
        hosteldetails_class hostels[] = new hosteldetails_class[4]; 

        hostels[0].make_hostels("Boys Hostel",1);
        hostels[1].make_hostels("Boys Hostel",2);
        hostels[2].make_hostels("Girls Hostel",1);
        hostels[3].make_hostels("Girls Hostel",2);

        new_stud[0].set_details("Varun", "20BCE1506", "CSE", 70);
        new_stud[1].set_details("Soma", "19BCE1501", "CSE", 100);
        new_stud[2].set_details("Hooda", "19EEE1008", "EEE", 85);
        new_stud[3].set_details("Tarun", "20MBA1908", "MBA", 90);
        new_stud[4].set_details("Bunnu", "22MBBS9009", "MBBS", 80);
        
        // pack1_obj.display(hostels);
        for (int i = 0; i < new_stud.length; i++) {
            new_stud[i].display();    
        }
        
        
        
        label : while (true) {     //this is a label in java
            System.out.print("1. New Student \n2. Transfer Hostels\n3. Check Rooms\n4. Search Student details\n5. Exit \n\nEnter your choice: ");
            int choice  = op.nextInt();

            switch (choice) {
                case 1:
                        System.out.print("Enter Student Name : ");
                        String name = op.nextLine();
                        System.out.print("Enter Registration Number : ");
                        String r_num = op.nextLine();
                        System.out.print("Enter Subject : ");
                        String sub = op.nextLine();
                        System.out.print("Enter Marks : ");
                        int mark = op.nextInt();
                        new_stud[stud_count++].set_details(name, r_num, sub, mark);
                        break;
                
                case 2:
                    pack1_obj.change_hostel(hostels);
                    break;

                case 3:
                    pack1_obj.get_rooms(hostels);
                    break;

                case 4:
                    pack2_obj.display(new_stud);
                    break;
                case 5:
                    System.out.print("\n\nThank you\n\n");
                    break label;
                default:
                System.out.print("\n\nWrong Choice enter, try again\n\n");
                    break;
            }
        }

        
    }
}
