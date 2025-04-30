//interface Truck{
//  Truck{
//      System.out.println("Welcome to our Truck Company");
//  }
//  class Car implements Truck{
//      void run(){
//          System.out.println("Truck can run 23km/h");
//      }
//      void fly(){
//          System.out.println("Truck can fly without any fan");
//      }
//      public static void main(String[] args){
//          Car t1=new Car();
//          t1.run();
//      }
//  }
//}
abstract class Truck {
    // Constructor
    Truck() {
        System.out.println("Welcome to our Truck Company");
    }

    // Abstract method
    abstract void run();
}

class Car2 extends Truck {
    Car2(){
        super();
        System.out.println("Car speed 25km/h");
    }
    @Override
    void run() {
        System.out.println("Truck can run 23km/h");
    }

    void fly() {
        System.out.println("Truck can fly without any fan");
    }

    public static void main(String[] args) {
        Truck t1 = new Car2();
        t1.run();
       // Car2 c2=new Car2();
       // c2.fly();


        // If you want to access fly()
        // ((Car) t1).fly();
    }
}
