import java.util.*;
// CAT - 1 Portions for STS : 
// Stack , Queue (Arrray,LinkedList, Prefere -> Collections)
// Implementing Stack using Queue, Queue using Stack 
// Learn Collections all functions of Stack and Queue
// are un-built into that 
// MultiThreading 
// Exception handling Try-catch
public class LinkedListQueue{
    Node front;
    Node rear;
    public LinkedListQueue(){
        front = null;
        rear = null;
    }
    private class Node{
        int i ;
        Node next;
        Node(int i){
            this.i = i;
        }
        public void displayData(){
            System.out.println(i+" ");
        }
    }

    public void insertLast(int i){
        Node newNode = new Node(i);
        if(front==null){
            front = newNode;
        }
        else{
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int removeFirst(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else{
            int temp  =front.i;
            if(front.next == null){
                rear = null;
            }
            front = front.next;
            return temp;
        }
    }

    public void display(){
        Node current = front;
        if(current ==null){
            System.out.println("No elements");
        }
        else{
            while(current !=null){
                current.displayData();
                current = current.next();
            }
            System.out.println();
        }
    }
}

public class day3_2 {
    public static void main(String[] args) {
        
    }
}
