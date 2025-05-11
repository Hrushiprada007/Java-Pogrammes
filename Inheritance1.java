                               //Simple or Single Inheritance
class A{
    void showA(){
        System.out.println("class a method");
    }
}
class B extends A{
    void showB(){
        System.out.println("class b method");
    }
    public static void main(String[] args){
        B c1=new B();
        c1.showA();
        c1.showB();
    }
}
