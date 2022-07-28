import java.util.Scanner;

class MyBook extends Book{

    String title,author;
    int price; 

    public MyBook(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
}

public class day13{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String t = op.nextLine();
        String a = op.nextLine();
        int p = op.nextInt();
        Book myrefBook = new MyBook(t,a,p);
        myrefBook.display();
        op.close();
    }
}