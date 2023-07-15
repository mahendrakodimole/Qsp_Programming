package numbers;

import java.util.Scanner;

public class SpyNum{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int num1=123;
		int sum=0;
		int product=1;
		while(num1>0)
		{
			int dig=num1%10;
			product=product*dig;
			sum=sum+dig;
			num1=num1/10;
		}
		if(sum==product)
		{	
			
    System.out.println("spy number");
	}		
}
}