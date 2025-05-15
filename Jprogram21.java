import java.util.Scanner;
class Charprint{
    public static void main(String args[]){
        char ch;
        System.out.print("Enter a character:");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        /* ch=r.next().charAt(3); */
        System.out.print(ch);
    }
}