// copying content of one file to another
import java.io.* ;
public class streams2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\input.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\output.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        System.out.print("\nThe available bytes are : " + bin.available());
        System.out.print("\nIs mark Supported? : " + bin.markSupported() + "\n");

        if (bin.markSupported()) {
            bin.mark(bin.available()); //mark the read limit for the file
        }

        int text;
        
        System.out.print("\n\nThe File Contents : \n");
        while ((text=bin.read()) != -1)
        {
            System.out.print((char)text);
            bout.write(text);
        }    
        
        System.out.print("\n\nWriting to file successful\n");
        bin.reset();
        bout.flush();
                
        bin.close(); fin.close();
        bout.close(); fout.close();
    }
}