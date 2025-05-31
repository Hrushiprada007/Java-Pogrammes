import java.util.Scanner;
class Month{
    public static void main(String args[]){
        int n;
        System.out.print("Enter a number:");
        Scanner m=new Scanner(System.in);
        n=m.nextInt();
        if(n==1){
            System.out.print("January=31 days");
        } else if(n==2) {
            System.out.print("february=28 days");
        } else if (n==3) {
            System.out.print("march=31 days");

        } else if (n==4) {
            System.out.print("April=30 days");

        } else if (n==5) {
            System.out.print("May=31 days");

        } else if (n==6) {
            System.out.print("June=30 dayys");

        } else if (n==7) {
            System.out.print("July=31 days");

        } else if (n==8) {
            System.out.print("August=31 days");

        } else if (n==9) {
            System.out.print("september=30 days");

        } else if (n==10) {
            System.out.print("October=31 days");

        } else if (n==11) {
            System.out.print("november=30 days");

        } else if (n==12) {
            System.out.print("December=31 days");

        }
        else{
            System.out.print("Invalid month number you choose");
        }

    }
}