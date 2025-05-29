class MethodO{
    void show(){
        System.out.println("hi");
    }
    void show(int x,int y){
        System.out.println("hello");
    }
    void show(int x,int y,float c){
        float d=(x+y)/c;
        System.out.println("Hi hello");
        System.out.println(d);
    }
    public static void main(String[] args){
        MethodO t1=new MethodO();
        t1.show();
        t1.show(3,8);
        t1.show(7,58,6.9f);
    }
}