package day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int first_term, second_term, third_term, temp;
		first_term = 0;
		second_term = 1;
		System.out.print(first_term+ " " +second_term);
		for(int i = 0; i < 8; i++)
		{
			temp = second_term;
			second_term = second_term+first_term;
			first_term = temp;
			System.out.print(" "+second_term);
		}

	}

}
