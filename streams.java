import java.io.* ; 

public class streams {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("C:\\Users\\gener\\Coding\\Java\\files made with code\\input.txt");
            out = new FileWriter("C:\\Users\\gener\\Coding\\Java\\files made with code\\output.txt");        

            int eof;
            while ((eof = in.read()) != -1){
                out.write(eof);
            }

            System.out.print("Input - Output Successful");
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
        catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
    }
}
