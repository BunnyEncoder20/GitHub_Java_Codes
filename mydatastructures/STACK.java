package mydatastructures;

public class STACK {
    int array[];
    int size;   
    int top;

    public STACK(int size){
        this.array = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int element)
    {
        if(!isFull())
        {
            array[++top] = element;
            System.out.print("Element "+element+" pushed successfully\n");
        }
        else 
            System.out.print("Stack overflow! pop some elements !\n");
    }

    public boolean isFull()
    {
        return top == size-1 ? true : false;
    }
    public boolean isEmpty()
    {
        return top == -1 ? true : false;
    }

    public void pop() {
        if(!isEmpty())
        {
            int element = array[top];
            System.out.print("Element "+element+" popped successfully\n");
            --top;
        }
        else 
            System.out.print("Stack underflow! push some elements !\n");
    }

    public void display()
    {
        System.out.print("\n\n");
        for(int i = 0; i<=top; i++)
            System.out.print(" -> "+array[i]);
    }
}
