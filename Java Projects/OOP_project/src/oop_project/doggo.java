package oop_project;

public class doggo extends mammal{
    
    String breed;

    public doggo(String name){
        super(name);
    }

    public void walk()
    {
        System.out.println("\nDoggo walking...");
        try {
            // Thread.sleep(2000);
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Done with walk");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
