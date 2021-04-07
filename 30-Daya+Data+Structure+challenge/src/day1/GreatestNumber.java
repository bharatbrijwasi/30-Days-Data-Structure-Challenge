package day1;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) 
	{
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		
		System.out.println("Enter the Third Number");
		num3 = sc.nextInt();
		
		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println("Greatest number among three numbers (" +num1+ " " +num2+ " " +num3+ ") is >>> " +num1);
			}
			else
			{
				System.out.println("Greatest number among three numbers (" +num1+ " " +num2+ " " +num3+ ") is >>> " +num3);
			}
		}
		else
		{
			if(num2 > num3)
			{
				System.out.println("Greatest number among three numbers (" +num1+ " " +num2+ " " +num3+ ") is >>> " +num2);
			}
			else
			{
				System.out.println("Greatest number among three numbers (" +num1+ " " +num2+ " " +num3+ ") is >>> " +num3);
			}
		}
	}

}
