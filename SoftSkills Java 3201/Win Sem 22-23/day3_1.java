import java.lang.reflect.Array;
import java.util.*;
// Implementing Queue using Array

class queue{
    private static int front, rear, capacity;
    private static int queue[];

    queue(int c){
        front = rear = 0;
        capacity = c ;
        queue = new int[capacity];
    }

    static void enqueue()
    {
        if (rear==capacity){
            System.out.println("Queue is Full");
        }
        else{
            queue[rear] = data;
            rear++;
        }
        return ;
    }

    static void dequeue()
    {
        if (front==rear){
            System.out.println("Queue is empty");
        }
        else{
            for (int i = 0; i < rear-1; i++) {
                queue[i] = queue[i+1];
            }
            rear--;
        }
        return ;
    }

    static void displau(){
        for (int i = 0; i < queue.length; i++) {
            
        }
    }
}

public class day3_1 {
    public static void main (String[] args){
        Scanner op  = new Scanner(System.in);
        int num = op.nextInt();
        queue q = new queue(num);
        op.close();
    }

}
