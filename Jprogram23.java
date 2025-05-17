import java.util.Scanner;
class Ascii {
    public static void main(String args[]) {
        char ch;
        System.out.print("Enter a alphabet character:");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        int a = ch;
        System.out.print("Ascii character of" + ch  +"is:"+a);
    }
}