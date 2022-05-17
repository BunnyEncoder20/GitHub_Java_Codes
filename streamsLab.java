import java.io.* ;
import java.util.Scanner ;

public class streamsLab {
    public static void main(String[] args) throws IOException{ 
        Scanner op = new Scanner(System.in);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        byte line[] = new byte[100];
        System.out.print("\nType the first line : \n");
        line = (op.nextLine()).getBytes();
        bout.write(line); bout.write("\n".getBytes());

        System.out.print("\nType the second line : \n");
        line = (op.nextLine()).getBytes();
        bout.write(line); bout.write("\n".getBytes());

        System.out.print("\nType the third line : \n");
        line = (op.nextLine()).getBytes();
        bout.write(line); bout.write("\n".getBytes());

        System.out.print("\n\nWriting to the file was successfully\n");
        bout.close();


        int count = 0;
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        System.out.println("\n\nThe File contents are : \n");
        byte array[] = new byte[(int)fin.getChannel().size()];
        fin.read(array);    //read the file into the byte array
        String str = new String(array); //declare new string and type cast the byte array into string
        String[] final_content = str.split(" ");  //make a string array splitting the previous string at spaces
        for (int i = 0; i < final_content.length; i++) {
            count++;
            System.out.print(final_content[i]+" ");
        }
        // count+=1;
        
        // int letter
        // while((letter = bin.read()) != -1){
        //     System.out.print((char)letter);
        // }

        System.out.print("\nReading from the file was Successful\n");
        bin.close();
        
        lines();
        vowels();
        System.out.println("\nThe word count of file is = " + count);
        casechange2();

        op.close(); 
    }

    public static void lines() throws IOException{
        FileReader fin = new FileReader("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        BufferedReader bin = new BufferedReader(fin);

        int lines = 0 ;
        while(bin.readLine() != null){
            lines++;
        }

        System.out.print("\n\nThe number of Lines in the file = " + lines);
        bin.close(); fin.close();
    }

    public  static void vowels()  throws IOException
    {
        int vowels=0, consonents =0;
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        byte array[] = new byte[(int)fin.getChannel().size()];
        fin.read(array);    //read the file into the byte array
        String str = new String(array); //declare new string and type cast the byte array into string
        // String[] final_content = str.split(" ");  //make a string array splitting the previous string at spaces

        // for (int i = 0; i < array.length; i++) {
        //     System.out.print(array);
        // }

        for(int i=0; i<str.length();i++) {
            char c = str.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                vowels++;
            }
            else if ( (c >= 'a' && c<= 'z') || (c >= 'A' && c <= 'Z') ) {
                consonents++;
            //for consonents must specify the letters range otherwise will give a number way bigger
            //because it'll count digits, spaces, etc in the consonent count
            }
        }
        
        
        System.out.println("\n\nThe vowel count of file is = " + vowels);
        System.out.println("\nThe consonent count of file is = " + consonents);
        bin.close();
    } 

    public static void casechange() throws IOException{
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        
        byte b[] = new byte[(int)fin.getChannel().size()];
        fin.read(b); String s = new String(b); StringBuilder newstring = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLowerCase(s.charAt(i))) {
                newstring.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            else if (Character.isUpperCase(s.charAt(i))){
                newstring.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }
            else{
                continue ;
            }
        }

        System.out.print("\n\nThe file content after case conversion : \n" + newstring);
        bin.close(); fin.close();
    }

    public static void casechange2() throws IOException{
        FileInputStream fin = new FileInputStream("C:\\Users\\gener\\Coding\\Java\\files made with code\\file1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        StringBuilder newstring = new StringBuilder((int)fin.getChannel().size());
        int c = 0; int i = 0;

        while((c = bin.read()) != -1){
            // char cc = (char) c ; 
            if (Character.isLowerCase((char)c)) {
                newstring.setCharAt(i, Character.toUpperCase((char)c));
            }
            else if (Character.isUpperCase((char)c)){
                newstring.setCharAt(i, Character.toLowerCase((char)c));
            }
            else{
                continue ;
            }
            i++;
        }

        System.out.print("\n\nThe file content after case conversion : \n" + newstring);
        bin.close(); fin.close();
    }

    //end of class
}
