import java.io.* ;
import java.util.* ;

public class streamlabs2 {
    public static void main(String[] args) throws IOException{
        bufferinout();
        sequenceinout();
        bytearrayinout();
        datainout();
        filterinout();
    }
    
    public static void bufferinout() throws IOException {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\bufferio.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        Scanner op = new Scanner(System.in);

        System.out.print("\n\nEnter the string for the file : \n");
        byte[] str = op.nextLine().getBytes();

        for(int i = 0; i<str.length; i++){
            bout.write(str[i]);
        }
        
        System.out.print("\n\nWriting to file done\n" );

        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\bufferio.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        System.out.print("\nFile Contents are : \n" );
        // int text = 0;
        // while ((text = bin.read()) != -1) {
        //     System.out.print(text);
        // }
        // byte array[] = new byte[(int)fin.getChannel().size()];
        // byte array2[] = new byte[100];
        byte[] array3 = new byte[str.length];
        System.out.print("Size : " + str.length);
        String strout = new String(array3);
        String[] content = strout.split(" ");
        for (int i = 0; i < content.length; i++) {
            System.out.print(content[i]+" ") ;
        }
        // ?Not about to read the file??? 
        System.out.print("\nReading from the file done\n" );
        bin.close(); bout.close(); op.close();
    }

    public static void sequenceinout() throws IOException{
        FileInputStream fin1 = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\bufferio.txt");
        SequenceInputStream seqin = new SequenceInputStream(fin1,fin2);

        System.out.print("\n\nReading from 2 streams at once : \n");
        int text = 0;

        while((text = seqin.read()) != -1){
            System.out.print((char)text);
        }

        System.out.print("\n\nReading from 2 streams completed \n");    
        seqin.close(); fin1.close(); fin2.close();    
    }

    public static void bytearrayinout() throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\ByteArray.txt");
        ByteArrayOutputStream byout = new ByteArrayOutputStream();
        Scanner op = new Scanner(System.in);

        System.out.println("\n\nEnter the content of file :\n");
        byte[] str = op.nextLine().getBytes();

        byout.write(str);
        byout.writeTo(fout);

        System.out.println("\nWriting to file completed\n");
        byout.flush(); byout.close(); op.close();

        System.out.println("\nFile Contents are : \n");
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\ByteArray.txt");
        byte[] input = new byte[(int)fin.getChannel().size()];
        fin.read(input);
        ByteArrayInputStream byin = new ByteArrayInputStream(input);

        int text = 0;
        while ((text = byin.read()) != -1){
            System.out.print((char)text);
        }

        System.out.println("\nReading from file completed\n");
        fin.close(); byin.close();
    }

    public static void datainout() throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\data.txt");
        DataOutputStream dout = new DataOutputStream(fout);

        System.out.println("\n\nWriting to the File....\n");
        System.out.println("\n65 (using .writeInt())\n");
        dout.writeInt(65);

        System.out.println("Soma and Bunny are best friends\n");
        dout.writeUTF("\nSoma and Bunny are best friends\n");

        System.out.println("Hooda and Bunnu are principal of locatility friends\n");
        dout.writeChars("\nHooda and Bunnu are principal of locatility friends\n");

        System.out.println("65 (using .writeChar())\n");
        dout.writeChar(65);

        System.out.print("\nWriting to the file compelted\n");
        dout.flush(); dout.close(); fout.close();

        //   ??? this data stream reading is not working ???

        System.out.print("\n\nThe file contents are :\n");
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\data.txt");
        DataInputStream din = new DataInputStream(fin);

        byte[] content = new byte[(int)fin.getChannel().size()];
        din.read(content);

        int text = 0 ;
        for(int i=0; i<content.length; i++){
            System.out.print((char)text);
        }
        
        System.out.print("\nReading from the file compelted\n");
        din.close(); fout.close();

    }

    public static void filterinout() throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\filterio.txt");
        FilterOutputStream filout = new FilterOutputStream(fout);
        Scanner op = new Scanner(System.in);

        System.out.print("\n\nEnter the File Content\n");
        byte[] array = op.nextLine().getBytes();
        filout.write(array);

        System.out.print("\nWriting to the file compelted\n");
        filout.flush(); filout.close(); op.close();

        System.out.print("\nThe file content are :\n");
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\filterio.txt");
        FilterInputStream filin = new BufferedInputStream(fin);

        // for(int i =0; i<filin.available(); i++){
        //     System.out.print((char)filin.read());
        // }
        int text = 0;
        while((text = filin.read()) != -1){
            System.out.print((char)text);
        }
        System.out.print("\nReading from the file compelted\n");
        filin.close(); 
    }
}
