import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;

class A{
	public void king(){
		System.out.println("Jaguar");
	}
}

class B extends A{
	public void king(){
		System.out.println("Tiger");
	}
}

public class temp{
	public static void main(String[] args) {
		String str1  = "Hello";
		String[] arr = str1.split("");
		for(String s : arr){
			System.out.println(s);
		}

		String str2 = "0123456789Hellothere";
		System.out.println(str2.substring(0,10));
		System.out.println(str2.substring(10));
	}
}