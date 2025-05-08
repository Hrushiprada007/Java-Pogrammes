class test1{
    test1(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public void run(){
        System.out.println("I can run");
    }
    public static void main(String[] args){
        test1 t2=new test1(9,8);
        test1 t1=new test1(4 ,9);
        t1.run();
    }

}