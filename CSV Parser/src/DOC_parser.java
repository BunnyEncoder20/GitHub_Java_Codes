import org.apache.poi.xwpf.usermodel.XWPFDocument ; 
import org.apache.poi.xwpf.extractor.XWPFWordExtractor; 
import java.io.* ;
import javax.swing.JFileChooser;


public class DOC_parser {
    public static void main(String[] args) throws Exception{

        JFileChooser window = new JFileChooser();
        int return_ = window.showOpenDialog(null); //returns a int, opens the file chooser window  

        //APPROVE_OPTION is to check if the user clicked on the ok button
        if (return_ == JFileChooser.APPROVE_OPTION) {
            XWPFDocument doc = new XWPFDocument(new FileInputStream(window.getSelectedFile()));
            XWPFWordExtractor extracted = new XWPFWordExtractor(doc);
            
            System.out.print(extracted.getText());
            extracted.close();
        }
    }
}
