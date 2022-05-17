import java.util.Scanner;
import mydatastructures.STACK;

public class stack_packages {   
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        STACK mystack = new STACK(10);


        label : while (true) {     //this is a label in java
            System.out.print("\n\n1. Push Element \n2. Pop Element\n3. isEmpty\n4. isFull\n5. View Stack\n6. Exit \n\nEnter your choice: ");
            int choice  = op.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the Element : ");
                    int element = op.nextInt();
                    mystack.push(element);
                    break;
                
                case 2:
                    mystack.pop();
                    break;

                case 3:
                    if(mystack.isEmpty())
                        System.out.print("Yep, the stack is empty!");
                    else
                        System.out.print("No, the stack still has some elements!");
                    break;
                case 4:
                    mystack.isFull();
                    if(mystack.isFull())
                    System.out.print("Yep, the stack is Full!");
                else
                    System.out.print("No, the stack still has some free space!");
                break;
                case 5:
                    mystack.display();
                    break;
                case 6:
                    System.out.print("\n\nThank you\n\n");
                    break label;
                default:
                System.out.print("\n\nWrong Choice enter, try again\n\n");
                    break;
            }
        }
        op.close();
    }
}
