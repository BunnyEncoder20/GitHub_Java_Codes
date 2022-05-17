import java.io.File ;
import java.io.FileNotFoundException;
// import java.io.FileWriter ;
import java.io.IOException ;
import java.util.Scanner ;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class files {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\gener\\Coding\\Java\\files made with code\\filename.txt");
        
        try{
            Scanner op = new Scanner(obj);
            System.out.print("\nExists : " + obj.exists());
            System.out.print("\nName : " + obj.getName());
            System.out.print("\nAbsolute Path : " + obj.getAbsolutePath());
            System.out.print("\nSize of File : " + obj.length());
            System.out.print("\nContents : " );

            while(op.hasNextLine()){
                String data = op.nextLine();
                System.out.println(data);
            }
            obj.delete();    
            op.close();
        }
        catch (FileNotFoundException io)
        {
            io.printStackTrace();
        }
        
    }
}
