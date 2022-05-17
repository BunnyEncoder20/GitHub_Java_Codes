import java.io.* ;

public class catq {
    public static void main(String[] args) throws IOException {
        readfile();
        writefile();
        read_the_written_file();
    }

    static byte[] array = new byte[1000]; 
    static int i = 0; 

    synchronized public static void readfile() throws IOException{
        FileInputStream fin1 = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\f1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\f2.txt");
        SequenceInputStream seqin = new SequenceInputStream(fin1,fin2);

        System.out.print("\n\nReading from f1 & f2: \n");
        int text = 0;

        while((text = seqin.read()) != -1){
            array[i++] = (byte)text;
        }

        System.out.print("\n\nReading completed \n");    
        seqin.close(); fin1.close(); fin2.close();       
    }

    synchronized public static void writefile() throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\f3.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        System.out.print("\n\nWriting to the File f3\n");
        bout.write(array);

        bout.close();
    }

    synchronized public static void read_the_written_file() throws IOException{
        FileReader fread = new FileReader("C:\\Users\\gener\\Coding\\Java\\files made with code\\f3.txt");
        
        System.out.println("\nFile contents before filtering : \n");
        int text;
        while ((text = fread.read()) != -1) {
            System.out.print((char) text ) ; 
        }
        fread.close();

        //extracting keywords 
        String[] exclude = new String[10];
        exclude[0] = "to";
        exclude[1] = "the";
        exclude[2] = "This";
        exclude[3] = "are";
        exclude[4] = "and";
        exclude[5] = "in";
        exclude[6] = "of";
        exclude[7] = "is";
        exclude[8] = "at";
        exclude[9] = "that";

        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\f3.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        // System.out.print("Size : " + (int)fin.getChannel().size());
        byte array[] = new byte[(int)fin.getChannel().size()];
        fin.read(array);    
        String str = new String(array); 
        String[] final_content = str.split(" ");
        
        for (int i = 0; i < final_content.length; i++) {
             for (int j = 0; j < exclude.length; j++) {
                 if (final_content[i].compareTo(exclude[j]) == 0) {
                     final_content[i] = "" ;
                 }
             }
        }

        System.out.println("\n\nThe content after filter the keywords :\n");
        for (int i = 0; i < final_content.length; i++) {
            System.out.print(final_content[i]+" ");
        }

        bin.close();
    }
}
