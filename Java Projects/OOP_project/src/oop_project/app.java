package oop_project;

public class app {
    public static void main(String[] args) {
        mammal animal1 = new mammal("Tommy");
        animal1.age = 5;
        animal1.type = "doggo";
        animal1.color = "black";

        System.out.println("Name : "+animal1.name);
        System.out.println("Age : "+animal1.age);
        System.out.println("Type : "+animal1.type);
        System.out.println("Color : "+animal1.color);
    }
}
