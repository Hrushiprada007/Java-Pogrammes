import java.util.Scanner;

class A4{
    public static void main(String[] args) {
        int a[]=new int[7];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        System.out.println("Array elements :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            System.out.println(" ");
        }
        System.out.println("Arry lenth="+a.length);
    }
}