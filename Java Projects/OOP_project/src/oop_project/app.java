package oop_project;

public class app {
    public static void main(String[] args) {
        doggo animal1 = new doggo("Tommy");
        animal1.age = 5;
        animal1.type = "doggo";
        animal1.color = "black";

        human person1 = new human("Varun");
        person1.age = 21;
        person1.type = "human";
        person1.color = "gora";

        System.out.println("Name : "+animal1.name);
        System.out.println("Age : "+animal1.age);
        System.out.println("Type : "+animal1.type);
        System.out.println("Color : "+animal1.color);
        animal1.sleeping();
        animal1.eating();
        animal1.walk();

        System.out.println("\n");
        System.out.println("Name : "+person1.name);
        System.out.println("Age : "+person1.age);
        System.out.println("Type : "+person1.type);
        System.out.println("Color : "+person1.color);
        person1.eating();
        person1.sleeping();
        person1.twerk();
    }
}
