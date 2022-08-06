package HRpackages;

/**
 * queueclass
 */
public class queueclass {
    private static class node{
        private int data;
        private node next;

        private node(int data){
            this.data = data;
        }
    }

    private node head = null;
    private node tail = null;

    public boolean isEmpty() {
        return head==null;
    }

    public void peek() {
        node temp = head;
        while (temp.next!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void enqueue(int data){
        node newnode = new node(data);
        if(tail!=null){
            tail.next = newnode;
        }
        tail = newnode;
        if(head==null){
            head=newnode;
        }
    }    

    public int dequeue() {
        int data = head.data;
        head = head.next;
        if(head==null){
            tail=null;
        }
        return data;
    }
}