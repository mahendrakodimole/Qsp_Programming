package numbers;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to find sum of factors");
		int n=sc.nextInt();
		
		int sum=1+n;
		
		for(int i=2;i<=n/2;i++) 
			if(n%i==0)
				sum+=i;
		
		System.out.println(sum);
	
		
	}
}


