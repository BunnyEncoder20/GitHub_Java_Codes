package HRpackages;

public class linkedlist{
    public static class node{
        int data;
        node next;

        public node(linkedlist list, int data){
            this.data = data;
            next = null;
        }
    }

    node head = null;

    public void insert(linkedlist list,int data){
        node newnode = new node(list, data);    //making a new node

        //check if the list is empty, if so insert the new node as the head of the list 
        if (list.head==null) {
            list.head=newnode;
        } 
        else {      //else insert at the end
            node temp = list.head;      //creat a temp node at the head (kinda a pointer)
            while(temp.next!=null){     //traverse till the last node in the list
                temp = temp.next;       
            }
            temp.next = newnode;        //assign the next node after the last node to the new node
        }
    }

    public void showlist(linkedlist list){
        node currentnode = list.head;       //make a pointer node like in insert

        while(currentnode.next!=null){      //keep traversing till the end 
            System.out.print(currentnode.data+" ");  //disaplay the data values as you go along
            currentnode = currentnode.next;     
        }
        System.out.print(currentnode.data);     //to display the last node data
    }
}
