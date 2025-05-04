class Animal1{
    public void eat(){
        System.out.println("animals are eating grass");
    }
    public void run(){
        System.out.println("animals are running into the ground");
    }
    public static void main(String[] args){
        Animal1 e=new Animal1();
        System.out.println("Hi my friends");
        e.eat();
        e.run();
        e.sleep();
        Birds sp=new Birds();
        sp.dance();
    }
    public void sleep(){
        System.out.println("animals are sleeping in their shed");
    }
}
class Birds{
    public void dance(){
        System.out.print("Now animals are danicig");
    }
}