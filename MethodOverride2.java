class Test5{
    void show(){
        System.out.println("1");
    }
}
class Xyz extends Test5{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args){
        Xyz t1=new Xyz();
        t1.show();
        Test5 t2=new Test5();
        t2.show();
    }
}