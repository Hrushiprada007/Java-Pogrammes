class Titan{
    void show(int a,int b,float c){
        System.out.println(a+b-c);
    }
    void show(String a,String b){
        System.out.println(a+" "+b);
    }
}
class Akash extends Titan{
    void show(int a,int b,float c){
        System.out.println(a-c+b);
    }
    public static void main(String[] args){
        Akash a1=new Akash();
        a1.show(2,89,65.8f);
        Titan t1=new Titan();
        t1.show(5,6,7.8f);
        t1.show("Hello","world");
    }
}