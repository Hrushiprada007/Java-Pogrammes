import java.util.Scanner;
class Swapping1  
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the two value:");
		int a = s1.nextInt();
		int b = s1.nextInt();
		int temp;
		System.out.println("Before swapping a value is:"+a);
		System.out.println("Before  swapping b value is:"+b);
		 temp = a;
		 a = b;
		 b = temp;
		 System.out.println("After swapping a value is:"+a);
		 System.out.println("After swapping b value is:"+b);
	}
}
