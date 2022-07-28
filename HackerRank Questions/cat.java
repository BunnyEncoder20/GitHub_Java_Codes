public class cat extends pets {
    
    public cat(String name, int age){
        super(name, age);
    }

    @Override
    public void speak(){
        System.out.println(this.name+" said MEOW !");
    }
}
