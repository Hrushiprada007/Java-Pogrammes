abstract class AnimalJ{
    private String name;//Encapsulation
    public AnimalJ(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract void makesound();
}
class Doggy extends AnimalJ{
    public Doggy(String name){
        super(name);
    }
    @Override
    public void makesound(){
        System.out.println(getName()+"says:woof");
    }
}
class cat extends AnimalJ{
    public cat(String name){
        super(name);
    }
    @Override
    public void makesound(){
        System.out.println(getName()+"says:meow");
    }
}
class OOps5{
    public static void main(String[] args){
        AnimalJ d1=new Doggy("Goodly");
        AnimalJ c1=new cat("Timi");
        d1.makesound();
        c1.makesound();
    }
}