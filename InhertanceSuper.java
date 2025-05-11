class VehicleS{
    void brand(String brand){
        System.out.println("Vehicle is in "+brand+" this brand");
    }
    void speed(String km){
        System.out.println("Vehicle speed in "+km);
    }

}
class Car5 extends VehicleS{
    void name(String Name){
        System.out.println("car name:"+Name);
    }
}
class Bike3 extends VehicleS{
    void range(int range){
        System.out.println("Bike range is:"+range);
    }
    public static void main(String[] args) {
        Car5 c1=new Car5();
        c1.name("Indica");
        c1.brand("good");
        c1.speed("45km");
        Bike3 b1=new Bike3();
        b1.brand("Honda");
        b1.speed("50km");
        b1.range(125);

    }
}