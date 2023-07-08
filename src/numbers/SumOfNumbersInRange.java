package numbers;

import java.util.Scanner;

public class SumOfNumbersInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number intial value");
		int iR=sc.nextInt();
		
		System.out.println("Enter a number final value");
		int fR=sc.nextInt();
		
		int product=1;
		
		for(int i=iR;i<=fR;i++) {
			product*=i;
		}
		
		System.out.println("Product of all numbers in range of "+iR+" & "+fR+" (inclusive) is :"+product);
		
	}

}
