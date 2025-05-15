class Srusti{
    int add(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    float div(float a,float c){
        float d=a/c;
        System.out.println(d);
        return d;
    }
}
public class JavaClg {
    public static void main(String[] args) {
        Srusti s=new Srusti();
        System.out.println(s.add(33,55));
        System.out.println(s.div(39,9));
        float x=s.div(2.4f,5.7f);
        int v=78;
        float e=v/x;
        System.out.println(e);
    }
}
