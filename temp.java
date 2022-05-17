import java.util.Scanner;

class limitexception extends Exception{
	limitexception(String msg){
		super(msg);
	}
}

public class temp{

	static void limitchk(int x, int y) throws limitexception{
		if(x>100 || y>100)
			throw new limitexception("The numbers must be less than 100");
		// else
		// 	System.out.println("Calculating the math");
	} 

	public static void main(String[] args) {
		// int x,y;
		Scanner op = new Scanner(System.in);

		System.out.println("Enter the line :");
		String line;
		line = op.nextLine();
		char[] array = line.toCharArray();
		String revarray = "";

		for (int i = array.length-1; i >=0; i--) {
			revarray += array[i];
		}
		if (line.equals(revarray)) {
			System.out.println("The given word is a palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		op.close();
	}
}