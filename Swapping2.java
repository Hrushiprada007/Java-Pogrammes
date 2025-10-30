import java.util.Scanner;
class Swapping2 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the two value:");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println("Before swapping a value is:"+a);
		System.out.println("Before  swapping b value is:"+b);
		//Logic2 - use  +  & - (operator) without using third variable

	 	//a = a+b;
		//b = a -b;
		//a = a- b;
		 
		//Logic3 - use * and / without using third variable
		//here a & b values should not be zero
         //a = a * b; //let a = 10 , b = 20 , now a = 200
		 //b = a / b; //b = 200/20 = 10
		 //a = a /b ;// a = 200/10 = 20

		 //Logic4 -  bitwise XOR(^) // binary form a = 10 = 1010 , and b = 20 = 10100
		 //a = a^ b; // let a = 10 , b = 20   then a^b = 1010 ^ 101000 = 11110 = 30
		 //b = a^ b; // 30 ^ 20 =  10
		 //a = a^ b; //30 ^ 10 = 20

       //Logic5 - Single statement
	    b = a + b - (a = b); //let a = 10 , b = 20 
		                             // b = 10 + 20  - 20 = 10
									 //b = 10 +20 - 10 = 20





		 System.out.println("After swapping a value is:"+a);
		 System.out.println("After swapping b value is:"+b);
	}
}
