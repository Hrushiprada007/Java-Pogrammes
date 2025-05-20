import java.util.Scanner;
class CalTotalAvg {
    public static void main(String args[]){
        int a,b,c,d,e,Total;
        float avg;
        System.out.print("Enter the five subject marks:");
        Scanner A=new Scanner(System.in);
        a=A.nextInt();
        b=A.nextInt();
        c=A.nextInt();
        d=A.nextInt();
        e=A.nextInt();
        Total=a+b+c+d+e;
        System.out.println("THe totla value of five subject is:"+Total);
        avg=Total/5;
        System.out.println("THe average value of submarks is:"+avg);

    }
}
