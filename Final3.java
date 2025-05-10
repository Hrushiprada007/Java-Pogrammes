 class Kml{
    void show(){
        int a=23;
        double b=89.45;
        System.out.println(a*b);
    }
}
 class Kull extends Kml{
    void dispaly(int a,int b){
        super.show();
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Kull k1=new Kull();
        k1.dispaly(4,90);
    }
}