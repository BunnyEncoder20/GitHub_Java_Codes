package practice;

/**
 *
 * @author Bunny <SomaSenpai.org>
 */
import java.io.*;
import java.util.Scanner;
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedOutputStream bout1 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\fat1.txt"));
        BufferedOutputStream bout2 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\fat2.txt"));
        System.out.println("Enter the file 1 string : ");
        Scanner op = new Scanner(System.in);
        String str = op.nextLine();
        byte b[] = str.getBytes();
        bout1.write(b);
        System.out.println("Writing to file1 Successful");
        bout1.flush(); bout1.close();
        System.out.println("\nEnter the file 2 string : ");
        
        String str2 = op.nextLine();
        byte b2[] = str2.getBytes();
        bout2.write(b2);
        System.out.println("Writing to file2 Successful");
        bout2.flush(); bout2.close();
        
        FileInputStream f1 = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\fat1.txt");
        FileInputStream f2 = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\fat2.txt");
        SequenceInputStream sis = new SequenceInputStream(f1,f2);
        
        int eof=0;
        while((eof=sis.read())!=-1)
        {
            System.out.print((char)eof);
        }
            
        System.out.println("\nReading from file Successful");
        
        
        
    }
    
}
