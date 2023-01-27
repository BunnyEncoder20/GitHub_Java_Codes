// Singly Linked List using dynamic memeory allocation
// Cat Questions related to LinkedList
// Reversing the LinkedList 
// Nth Element of the LinkedList 
// Also do Postfix and Infix questions 

import java.util.*;

class Node{
    int data;
    int next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    public Node headNode = null;
    public Node tailNode = null;

    void insertAtBack(int data){
        Node newNode = new Node(data);

        if (headNode==null) {
            headNode = tailNode = newNode;
        }
        else{
            tailNode.next = newNode;        //previous tail pointing to the new tail
            tailNode = newNode;                 //newNode becomes the new tail
        }
    }

    void insertAtFront(int data){
        Node newNode = new Node(data);

        if(headNode==null){
            headNode = tailNode = newNode;
        }
        else{
            newNode.next = headNode;
            headNode = newNode;
        }
    }

    void insertAtCenter(int data,int count){
        Node newNode = new Node(data);
        
        if(headNode==null){
            headNode= tailNode = newNode;
        }
        else{
            Node temp = headNode;
            while (count--!=0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            delete(temp);
        }
    }
}
public class day4_1 {
    public static void main(String[] args) {
        
    }
}
