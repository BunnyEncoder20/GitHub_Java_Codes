import java.util.*;

public class maps_dictionary {
    public static void main(String[] args) {
        Map<String,Long> phonebookMap = new HashMap<String,Long>();
        Scanner op = new Scanner(System.in);
        int keys = op.nextInt();
        String temp1 = op.nextLine();

        for (int i = 0; i < keys; i++) {
            String key = op.nextLine();
            Long value = op.nextLong();
            String temp2 = op.nextLine();
            phonebookMap.put(key, value);
        }

        for (int i = 0; i < keys; i++) {
            String find = op.nextLine();
            if (phonebookMap.containsKey(find)) {
                System.out.println(find+"="+phonebookMap.get(find));
            } else {
                System.out.println("Not found");
            }
        }

        op.close();
    }
}
