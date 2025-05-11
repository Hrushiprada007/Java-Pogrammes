class A2 {
    void showA() {
        System.out.println("class A method");
    }
}

class B2 extends A1 {
    void showB() {
        System.out.println("class B method");
    }
}

class C2 extends A1 {
    void showC() {
        System.out.println("class C method");
    }

    public static void main(String[] args) {
        A2 t1=new A2();
        t1.showA();
        //t1.showB();
        //t1.showC();
        System.out.println("---------------");
        B2 t2=new B2();
        t2.showA();
        t2.showB();
        //t2.showC();
        System.out.println("---------------");

        C2 t3 = new C2();
        t3.showA();
       // t3.showB();
        t3.showC();
    }
}