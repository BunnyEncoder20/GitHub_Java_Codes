package oop_project;

public class doggo extends mammal{
    
    String breed;

    public doggo(String name){
        super(name);
    }

    public void sniff()
    {
        System.out.println("\nDoggo sniffing...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nDone !");
    }
}
