 abstract class Abs{
    abstract void display();
}
class H5 extends Abs{
    int a=90;
    void display(){
        System.out.println("This is class B");
    }

    public static void main(String[] args){
        H5 n1=new H5();
        n1.display();
    }

}