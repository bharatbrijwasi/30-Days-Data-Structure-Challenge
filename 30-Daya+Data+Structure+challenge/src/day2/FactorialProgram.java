package day2;
import java.util.Scanner;
public class FactorialProgram {

	/*public static void main(String[] args) 
	{
		long factorial = 1;
		int n;
		int base = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number n: ");
		n = sc.nextInt();
		/*
		for(base; i <= n; i++)
		{
			factorial = factorial*i;
		}
		System.out.println("Factorial of Number " +n+ " is: " +factorial);
		*/
		
		// Second way with while loop
		/*
		int temp = n;
		while(n > 0)
		{
			factorial = factorial*n;
			n = n-1;
		}
		System.out.println("Factorial of Number " +temp+ " is: " +factorial);
		*/
		
		//3. By recursion method
		
		static int fact(int n)
		{
			if(n == 0)
			{
				return 1;
			}
			else
			{
				return (n*fact(n-1));
			}
			
		}
		
		public static void main(String[] bharat)
		{
			int fact=1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int number = sc.nextInt();
			fact = fact(number);
			System.out.println("Factorial of " +number+ " is:" +fact);
		}
	//}

}
