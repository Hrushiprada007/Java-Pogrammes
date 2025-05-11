class C{
    void show(){
        System.out.println("it is the method A");
    }
}
class D extends C{
    void disp(){
        int a=5;
        int b=8;
        System.out.println(a+b);
        System.out.println((a+b)*5);
    }
    public static void main(String[] args){
        D b1=new D();
        b1.show();
        b1.disp();
    }
}