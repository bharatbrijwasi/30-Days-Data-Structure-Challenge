package day2;
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquation {

	public static void main(String[] args) 
	{
		int a, b, c, D, x1, x2, rp, ip;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the variable value of Quadratic equation.");
		
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
		
		System.out.println("Enter the value of c:");
		c = sc.nextInt();
		
		System.out.println("Quadratic Equation: " +a+ "x^2+" +b+ "x+" +c+ " = 0 ");
		
		//Calculate the D.
		D = (int) (Math.pow(b, 2)-4*a*c);
		
		if(D >= 0)
		{
			x1 = (int) (-b + Math.sqrt(D));
			x2 = (int) (-b - Math.sqrt(D));
			System.out.println("Real roots of Quadratic Equation: " +x1+ ", " +x2);
		}
		else
		{
			//Calculate the real and imaginary part of Quadratic Equation.
			rp = (int) -b/2*a;
			ip = (int) (Math.sqrt(-D))/2*a;
			System.out.println("Imaginary roots of Qudratic Equation: " +rp+ ", " +ip);
		}
	}

}
