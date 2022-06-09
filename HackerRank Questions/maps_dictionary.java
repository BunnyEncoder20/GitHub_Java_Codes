import java.util.*;

/*
 *  Map is a interface in java 
 *  Interfaces cannot have objects of their own
 *  Hence a seperate class is made to implement Map which is HashMap
 *  Hence when we use use Map, we create a object of class HashMap 
 */
public class maps_dictionary {
    public static void main(String[] args) {
        Map<String,Long> phonebookMap = new HashMap<String,Long>();
        Scanner op = new Scanner(System.in);
        int keys = op.nextInt();
        String temp1 = op.nextLine();

        for (int i = 0; i < keys; i++) {
            String input[] = op.nextLine().split(" "); 
            String  key = input[0];
            Long value = Long.parseLong(input[1]);
            phonebookMap.put(key, value);
        }

        //To display all the key - value entries :-
        // for (String key : phonebookMap.keySet()) {
        //     System.out.println("Key : " + key +"    Value : " + phonebookMap.get(key));
        // }


        //while(op.hasNext() keeps taking input till user enters one)
        // ctrl+z+enter to exit from terminal
        while (op.hasNext()) {
            String key = op.nextLine();
            
            if (phonebookMap.containsKey(key)) {
                System.out.println(key+"="+phonebookMap.get(key));
            } else {
                System.out.println("Not found");
            }
        }

        op.close();
    }
}
