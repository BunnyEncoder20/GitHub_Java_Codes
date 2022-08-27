// Inner Classes

class student{
    int roll_numebr=1506;
    String name = "ABC";
    class date{     //Inner class : class within a class
        String DOB = "25-Aug-2022";
    }
}

public class day13 {
    public static void main(String[] args) {
        student s = new student();
        student.date d = s.new date();
        /*
         * we first have to create a obj of the outer class
         * then only can we access the inner class data and methods
         * 
         * think of it as a block. 
         * The outer class will be the outer block
         *  and the inner class will be another block insider that outer block
         *  that's why we need to use the outer class obj in the fetching of the inner class constructor 
         */
        System.out.println("Name : " + s.name);
        System.out.println("DOB : " + d.DOB);
    }
}
