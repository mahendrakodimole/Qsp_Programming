package numbers;
import java.util.Scanner;

public class SumOfDigit{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int num1=123;
		int sum=0;
		while(num1>0) 
		{
			int dig=num1%10;
			sum=sum+dig;
			num1=num1/10;
		}
		
		{	
    System.out.println(sum);
	}		
}
}
