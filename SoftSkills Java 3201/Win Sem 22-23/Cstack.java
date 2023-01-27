// Stack using Java Collections
import java.util.*;

public class Cstack {
    public static void main(String[] args) {
        // Syntax : 
        // Stack<type> name = new Stack<>();
        Stack<String> animal_stack = new Stack<>();

        animal_stack.push("Horse");
        animal_stack.push("Dog");
        animal_stack.push("cat");
        animal_stack.push("Lion");

        System.out.println("Stack : "+animal_stack);
        System.out.println("\n");
        System.out.println(animal_stack.peek());
        System.out.println(animal_stack.pop());
        System.out.println("Stack now : "+animal_stack);
    }
}
