class A1 {
    void showA() {
        System.out.println("class A method");
    }
}

class B1 extends A1 {
    void showB() {
        System.out.println("class B method");
    }
}

class C1 extends B1 {
    void showC() {
        System.out.println("class C method");
    }

    public static void main(String[] args) {
        A1 t1=new A1();
        t1.showA();
        //t1.showB();
        //t1.showC();
        System.out.println("---------------");
        B1 t2=new B1();
        t2.showA();
        t2.showB();
        //t2.showC();
        System.out.println("---------------");

        C1 t3 = new C1();
        t3.showA();
        t3.showB();
        t3.showC();
    }
}