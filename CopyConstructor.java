class E{
    int a; String b;
    E(){
        a=190;
        b="Welcome to HR !";
        System.out.println(a+" "+b);
    }
    E(E l){ //E l is the object reference
        a=l.a;
        b=l.b;
        System.out.println(a+" "+b);
    }
}
class F{
    public static void main(String[] args){
        E r=new E();
        E r2=new E(r);
    }
}


