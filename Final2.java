class Jonny{
     void m1(){  //if you can use final keyword in your method then this method can not be override ,it shows error also
        System.out.println("I am in the parent class");
    }
}
class Sonny extends Jonny{
    void m1(){
        System.out.println("I am in the test class");
    }
    public static void main(String[] args){
        Sonny s1=new Sonny();
        s1.m1();
    }
}

/*java: m1() in Sonny cannot override m1() in Jonny
overridden method is final */