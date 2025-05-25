class Method extends Thread{
    @Override
    public void run() {
        for (int i = 1; i<=100; i++) {
            System.out.println(i + " ");
        }
    }
}
class Method4 extends Thread{
    @Override
    public void run() {
            for (int i = 100; i <=200; i++) {
                System.out.println(i + " ");
            }
        }
}
public class Method9 {
        public static void main(String[] args) {
            Method m1 = new Method();
            Method4 m2=new Method4();
            m1.start();
            m2.start();
        }

    }
