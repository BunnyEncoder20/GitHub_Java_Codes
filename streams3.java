import java.io.* ;

public class streams3 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\output2.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeUTF("Soma and Bunny");
        out.flush(); out.close();

        
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\output2.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        byte[] buffer = new byte[20];
        in.read(buffer, 2, 14);
        for(int i = 0; i <= 14;i++)
            System.out.print((char)buffer[i]);
        System.out.print("\n");

        System.out.print("\nUse of readBoolean : " + in.readBoolean());
        System.out.print("\nUse of read() method : \n");
        // int text;
        for(int i = 0 ; i<in.available();)
            System.out.print((char)in.read());

        in.close();
    }
}
