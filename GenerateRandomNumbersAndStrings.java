import java.util.Scanner;
import java.util.Random;
class  GenerateRandomNumbersAndStrings
{
	public static void main(String[] args) 
	{
		//Approach1 . Random
		/*Random rand = new Random();
		int rand_int = rand.nextInt(100); // 100 means it will generate 1 to 99
		System.out.println(rand_int);
		double rand_dbl = rand.nextDouble(); //range 0.0 and less than 1.0;
		System.out.println(rand_dbl);
		*/

		//Approach2 - Math class
		//System.out.println(Math.random());
		 
		 //Approach3 - Apache commons -lang API
		//https://commons.apache.org/ ---->you can go through this website and download the jar file  that file to embedded in your project path
		 String  randNum = RandomStringUtils.randomNumeric(5);
			
	}
}
