package oop_project;

public class human extends mammal {
    public human(String name)
    {
        super(name);
    }

    public void twerk()
    {
        System.out.println("\nTwerking...");
        try {
            for(int i=3; i>0 ;i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }

            System.out.println("Done shaking dat a$$ !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
