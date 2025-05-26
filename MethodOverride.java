class Peacock{
    void show(int a){
        System.out.println(a+"  "+"output ok");
    }
}
class Bull extends Peacock{
    void show(int a){
        System.out.println("output"+a);
    }
    public static void main(String[] args){
        Bull b1 =new Bull();
        b1.show(5);
        b1.show(8);
        Peacock p1=new Peacock();
        p1.show(9);
        p1.show(1234);
    }
}