package oop_project;

public class human extends mammal {
    public human(String name)
    {
        super(name);
    }

    @Override
    public void eating()
    {
        System.out.println("Human eating\nPLease wait");
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
    

    public void twerk()
    {
        System.out.println("\nTwerking...");
        try {
            for(int i=3; i>0 ;i--)
            {
                System.out.print(i);
                System.out.println(". twerk dat a$$");
                Thread.sleep(1000);
            }

            System.out.println("Done shaking dat a$$ !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
