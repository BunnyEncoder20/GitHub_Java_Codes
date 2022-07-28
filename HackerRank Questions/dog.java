public class dog extends pets{

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak()
    {
        System.out.println(this.name+" said BARK !\n");
    }
}
