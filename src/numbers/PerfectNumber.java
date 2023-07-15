package numbers;
import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int sum=0;
		for(int i=1; i<=(num/2); i++)
		{
		if(num%i==0)
		{
			sum=sum+i;
		}
		
		if(sum==num) 
		{
		System.out.println("perect6 num is:"+i);
		}
}
}
}