/**
 * tempCodeRunnerFile
 */
import java.io.*;
public class tempCodeRunnerFile {

	public static void main(String[] args) throws Exception{
		FileWriter fw1 = new FileWriter("C:\\Users\\gener\\Coding\\Java\\files made with code\\aio1.txt");
		FileWriter fw2 = new FileWriter("C:\\Users\\gener\\Coding\\Java\\files made with code\\aio2.txt");
		FileWriter fw3 = new FileWriter("C:\\Users\\gener\\Coding\\Java\\files made with code\\aio3.txt");
		FileWriter fw4 = new FileWriter("C:\\Users\\gener\\Coding\\Java\\files made with code\\aio4.txt");
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("Soma senpai gives being flustered for 10 mins straight yesterday night");
		caw.writeTo(fw1);
		caw.writeTo(fw2);
		caw.writeTo(fw3);
		caw.writeTo(fw4);
		fw1.close(); 
		fw2.close(); 
		fw3.close(); 
		fw4.close(); 
		caw.close();
		System.out.println("Success !");
	}
}