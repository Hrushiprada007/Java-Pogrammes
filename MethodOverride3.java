class Anil{
      Object show(){
        System.out.println("hello ,:");
        return null;
    }
}
class Makul extends Anil{
    String show(){
        System.out.println("worlds");
        return null;
    }
    public static void main(String[] args){
        Makul m1=new Makul();
        m1.show();
        Anil a1=new Makul();
        a1.show();
    }
}