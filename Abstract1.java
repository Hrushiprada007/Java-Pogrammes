//import com.sun.nio.sctp.AbstractNotificationHandler;

abstract class Vehicle2{
    abstract void start();

}
class car extends Vehicle2{
    void start(){
        //int x=wheels;
        System.out.println("Car can starts with key");
    }
    void start(int wheels){
        System.out.println("car has "+wheels +"no.of wheels");
    }
}
class Scooter extends Vehicle2{
    void start(){
        System.out.println("can start with self or kick");

    }
    void start(int wheels){
        System.out.println("Scooter has "+wheels+"no.of wheels");
    }
    public static void main(String[] args){
        car c1=new car();
        c1.start();
        c1.start(4);
        Scooter s1=new Scooter();
        s1.start();
        s1.start(2);
    }
}