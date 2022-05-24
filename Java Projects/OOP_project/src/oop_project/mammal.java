package oop_project;

public class mammal {

    //attributes of dog
    int age;
    String type;
    String color;
    String name;

    public mammal(String name)
    {
        // super();
        this.name = name;
    }

    void sleeping()
    {
        System.out.println("Sleeping...");
        try {
            // Thread.sleep(3000);
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            
            System.out.println("\nAwake now !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void eating()
    {
        System.out.println("Mammal eating\nPLease wait");
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }

            System.out.println("\nFinished eating !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
