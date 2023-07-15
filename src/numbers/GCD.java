package numbers;
import java.util.Scanner;

public class GCD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two  number:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
	    int gcd=0;
		
		int gcd1 = 0;
		for(int i=1; i<=num1&&i<=num2; i++) 
		
		{
			
			if(num1%i==0&&num2%i==0)
			gcd1=i;
		}
		System.out.println(gcd1);

}
}

