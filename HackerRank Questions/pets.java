public abstract class pets {
    
    String name;
    int age;

    public pets(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }

    public abstract void speak();   
    //if some class inherits the class pets, then that class had to complete this method
}
