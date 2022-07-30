import java.util.Scanner;
import HRpackages.linkedlist;

public class day15 {
    public static void main(String[] args) {
        linkedlist list = new linkedlist(); 

        Scanner op = new Scanner(System.in);
        int size = op.nextInt();
        for (int i = 0; i < size; i++) {
            int data = op.nextInt();
            list.insert(list, data);
        }
        list.showlist(list);
        op.close();
    }
}
