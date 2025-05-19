//input n=5
//power p=5
//5*5*5=125

import java.util.Scanner;
class Power{
    public static void main(String args[]){
        int i,n,p,result=1;
        System.out.print("Enter a no:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.print("Enter a power no:");
        p=r.nextInt();

        for(i=1;i<=p;i++){
            result=n*result;
        }
        System.out.println("The power of number is:"+result);
    }
}