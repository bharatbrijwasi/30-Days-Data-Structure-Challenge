package day1;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) 
	{
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		num1 = sc.nextInt();
		System.out.println("Enter the Second number");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("Sum of " + num1+ " and " +num2+ " is: " +sum);
	}

}
