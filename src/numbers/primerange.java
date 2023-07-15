package numbers;
import java.util.Scanner;

public class primerange
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the initial number:");
		int ir=s.nextInt();
		System.out.println("Enter the final number:");
		int fr=s.nextInt();
		int i;
		
		
		for(int n=ir; n<=fr; n++) {
			boolean isPrime=true;
		for(i=2;i<n;i++) {
			if(n%i==0)
			{
				isPrime=false;
				
			}
		}
		if(isPrime)
		{
			System.out.println(n+" "+"is a prime");
		}
		}
	}
}





