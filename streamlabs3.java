import java.io.* ;
import java.time.* ;

class donor implements Serializable{
    String name;
    int age;
    String address;
    String contact_number;
    String blood_group;
    LocalDate date_of_last_donation;

    public donor (String name, int age, String address, String contact_number, String blood_group, LocalDate date_of_last_donation)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact_number = contact_number;
        this.blood_group = blood_group;
        this.date_of_last_donation = date_of_last_donation;
    }

    public void getdata(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
        System.out.println(this.contact_number);
        System.out.println(this.blood_group);
        System.out.println(this.date_of_last_donation);
        System.out.println("\n\n");
    }

    public boolean aligible()
    {
        LocalDate today = LocalDate.now();      //storing current day
        Period timepePeriod = Period.between(this.date_of_last_donation, today);   //comparing last donation date withh today's date

        if (this.blood_group.equals("A +ve") && timepePeriod.getMonths()>=6)   //we check if number of months in more than 6
            return true;
        else
            return false;
    }

    
}


public class streamlabs3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        donor dons[] = new donor[5];
        
        //  ??? how is it showing local<0> is Null ??? 
        // LocalDate.of
        // Date d1 = new Date();
        
        // Calendar calendar = Calendar.getInstance();
        // calendar.set(2021, 11, 31);
        // Date d1 = calendar.getTime();

        dons[0] = new donor("Soma", 20, "303 ORA", "9827365891", "O +ve", LocalDate.of(2021, 03, 12));    
        dons[1] = new donor("Hooda", 19, "24  Chennai central", "88736473610", "A +ve", LocalDate.of(2021, 2, 13));
        dons[2] = new donor("Bunnu", 21, "101 DosaNagar", "8730909872", "B +ve", LocalDate.of(2021, 6, 9));
        dons[3] = new donor("Bunny", 20, "VIT chennai", "3712537864", "A +ve", LocalDate.of(2021, 12, 30));
        dons[4] = new donor("Tarun", 18, "Business Suite Airport", "9763544332", "A +ve", LocalDate.of(2021, 1, 6));

        System.out.print("\n\nWriting the Data to File...\n");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\donors.ser");
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        objout.writeObject(dons); //serializaing the object array

        System.out.print("\n\nWriting of data was successful\n");
        System.out.print("\nClosing File...\n");
        objout.close();

        System.out.print("\n\nReading data from the file\nPeople alligible for donations are : \n");
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\donors.ser");
        ObjectInputStream objin = new ObjectInputStream(fin);

        System.out.print("The deserialized objects : \n");
        System.out.print(objin.readObject().toString()+"\n");

        // ??? how the fish do I print this...???


        // donor[] readdonor = new donor[5];
        // readdonor = (donor[]) objin.readObject();

        // for (int i = 0; i < readdonor.length; i++) {
        //     if(readdonor[i].aligible())
        //     {
        //         readdonor[i].getdata();
        //     }
        // }

        System.out.print("\n\nReading of data Completed\n");
        System.out.print("\nClosing File...\n");
        objin.close();

    }
}
