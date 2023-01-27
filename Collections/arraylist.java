import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        // Array cannot change their size dynamically 
        // ArrayList can change their size dynamically

        // Syntax : ArrayList <type> arrayname = new ArrayList<>();
        // Syntax : arrayname.add() to add elements;

        ArrayList<String> students = new ArrayList<>();
        students.add("Varun");
        students.add("Tarun");
        students.add("Soma");
        students.add("Bunnu");
        students.add("Hoods");
        System.out.println(students);

        List<Integer> nums1 = new ArrayList();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        System.out.println(nums1);
        nums1.add(0,0);
        System.out.println(nums1);

        List<Integer> nums2 = new ArrayList();
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);

        System.out.println(nums2);

        nums1.addAll(nums2);
        System.out.println(nums1);
        System.out.println(nums1.get(9));
    }
}
