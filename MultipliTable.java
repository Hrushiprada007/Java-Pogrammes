import java.util.Scanner;
public class MultipliTable {
    public static void main(String args[]){
        int i,num;
        System.out.print("Enter a number:");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        for(i=1;i<=10;i++) {
            String p = num + " * " + i + " = " + (num * i);
        }
        ;
    }
}
