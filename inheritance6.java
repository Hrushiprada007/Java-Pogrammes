class Ai{
    void show(){
        int a=760;
        int b=390;
        int sum=a+b;
        System.out.println(sum*8);
    }
}
class Bi extends Ai{
    void disp(){
        int c=90;
        int d=56;
        int e=45;
        int f=(c*d*e)+890;
        System.out.println(f);
    }
}
class Ci extends Bi{
    void allow() {
        String solve;
        solve="solve quickly";
        System.out.println("the total value is: "+solve);
    }
    public static void main(String[] args){
        Ci d1=new Ci();
        d1.allow();
        d1.show();
        d1.disp();

    }
}