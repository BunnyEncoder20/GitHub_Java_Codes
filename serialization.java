import java.io.* ;

class employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public String number;

    public employee(String name,String address,int SSN,String number)
    {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    void mail_chk()
    {
        System.out.println("Sending mail to \n"+name+"\nAt "+address);
    }
}
public class serialization {
    public static void main(String[] args) throws IOException{
        employee e1 = new employee("Varun", "932 B-Block", 1001, "7304386014");

        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\serialized.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(e1);        //object serialized here
        out.close();

        employee e2 = null;
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\serialized.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        try {
            e2 = (employee)in.readObject(); //object deserialized here
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            in.close();
        }
        
        System.out.print("\nname : " + e2.name);
        System.out.print("\naddress : " + e2.address);
        System.out.print("\nSSN : " + e2.SSN);
        System.out.print("\nnumber : " + e2.number);
        e2.mail_chk();
    }
}
