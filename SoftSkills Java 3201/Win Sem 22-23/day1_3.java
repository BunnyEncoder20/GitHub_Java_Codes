import java.util.*;

// Java program to take a defined number of integers, number of rotations and position
// Roatate the list by the number of rotations and display the number on the user input 
// position
// Solve using LinkedList 

public class day1_3 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner op = new Scanner(System.in);
        int num = op.nextInt();
        while(num-- != 0)
        {
            list.add(op.nextInt());
        }
        int rotations = op.nextInt();
        int theif = op.nextInt();
        
        System.out.println(list);
        Collections.rotate(list,rotations);
        System.out.println(list);
        System.out.println(list.get(theif));
        op.close();
    }
}
