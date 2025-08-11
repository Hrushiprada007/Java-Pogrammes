import java.util.Scanner;
class Weekend{
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the week day no[0-6]:");
        Scanner w=new Scanner(System.in);
        n=w.nextInt();

        switch (n) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;   
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("not a valid mumber");
                break;
        }
    }
}