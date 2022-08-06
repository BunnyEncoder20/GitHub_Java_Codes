package HRpackages;

public class stackclass {

    private static class node{
        private int data;
        private node next;
        
        private node(int data){
            this.data = data;
        }
    }

    private node top=null;

    public boolean isEmpty(){
        return top==null;
    }

    public void peek(){
        node temp = top;
        while (temp.next!=null) {
            System.out.println(temp.data+" -> ");
        }
        System.out.println(temp.data);
    }

    public void push(int data){
        node newnode = new node(data);
        newnode.next = top; //the new node points to the oold top to create the link
        top = newnode; //the newnode becomes the new top
    }

    public int pop(){
        int data = top.data;
        top = top.next;
        return data;
    }
}
