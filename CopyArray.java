import java.util.Scanner;

class CArray{
    public static void main(String[] args){
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner c1=new Scanner(System.in);
        System.out.print("Enter the array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=c1.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            System.out.println(" ");
        }
        System.out.println("Copy array elements are:");
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}