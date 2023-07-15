package numbers;

import java.util.Scanner;

public class SumOfNumInRange
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first  number:");
		int ir=s.nextInt();
		System.out.println("Enter the last  number:");
		int fr=s.nextInt();
		
	    int sum=0;
		for(int i=ir; i<=fr; i++)
		{
	
		sum=sum+i;
		}
		System.out.println("sum of  number in given range:"+sum);
}
}