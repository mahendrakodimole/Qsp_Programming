package numbers;
import java.util.Scanner;

public class SumOfFactorial{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int sum=0;
		while(num>0)
		{
			int dig=num%10;
			int fact=1;
			for(int i=1;i<=dig;i++)
			{
		     fact=fact*i;
			}
		sum=sum+fact;
		num=num/10;
		}
    System.out.println(sum);
	}
}
