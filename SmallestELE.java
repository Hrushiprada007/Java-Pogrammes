import java.util.Scanner;
class SmallElemnt1{
    public static void main(String[] args) {
        int a[]=new int[6];int max;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the arry elements:");
        for(int i=0;i<6;i++){
            a[i]=s1.nextInt();
        }
        max=a[0];
        for(int i=0;i<6;i++){
            if(a[i]<max){
                max=a[i];
            }
        }
        System.out.println("The smallest element in array is:"+max);
        s1.close();

    }

}