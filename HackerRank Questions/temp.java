import java.util.Scanner;
import HRpackages.stackclass;
import HRpackages.queueclass;

public class temp {
    public static void main(String[] args) {
        queueclass queue = new queueclass();
        stackclass stack = new stackclass();
        Scanner op = new Scanner(System.in);
        
        System.out.println("Enter the Number of elements : ");
        int size = op.nextInt();
        
        for (int i = 0; i < size; i++) {
            int data = op.nextInt();
            queue.enqueue(data);
            stack.push(data);
        }
        queue.peek();
        stack.peek();
        for (int i = 0; i < size; i++) {
            System.out.println(queue.dequeue()+" was removed");
            System.out.println(stack.pop()+" was popped");
        }
        op.close();
    }
}
