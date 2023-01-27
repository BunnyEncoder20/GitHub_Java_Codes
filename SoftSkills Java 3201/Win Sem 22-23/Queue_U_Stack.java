// Implementing Queue Using Stack in Java 

import java.util.*;

class queueUsingStack{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    void enqueue(int x){
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }   //pushing all elements of stack1 into stack 2

        stack1.push(x);     // pushing the new element at the bottom of the stack (end of the queue)

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }// popping all the elements back from stack2 to stack1
    }

    void dequeue(){
        if(stack1.isEmpty()){
            System.out.println("The Q is empty !");
            return;
        }
        else{
            System.out.println("Element dequeue : "+stack1.pop());
        }
    }

    void display(){
        System.out.println("The is Queue Looks like : ");
        while (!stack1.isEmpty()) {
            System.out.print(stack2.push(stack1.pop())+" --> ");
        }
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
};

public class Queue_U_Stack {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        queueUsingStack obj = new queueUsingStack();
        int exit = 0;
        
        System.out.println("Choices are : \n1. Enqueue\n2. Dequeue\n3. Display Queue\n4. Exit");
        while (exit==0) {
            System.out.println("Enter Choice : ");
            int choice  = op.nextInt();

            switch(choice){
                case 1 : 
                    System.out.println("Enter the element : ");
                    obj.enqueue(op.nextInt());
                    break;
                
                case 2 : 
                    obj.dequeue();
                    break;
                
                case 3 : 
                    obj.display();
                    break;

                case 4 : 
                    exit = 1;
                    break;
            }
        }

        System.out.println("Thank you , Have a nice Day!");
        op.close();
    }    
}
