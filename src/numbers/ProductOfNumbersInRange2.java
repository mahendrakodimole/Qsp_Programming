package numbers;

import java.util.Scanner;

public class ProductOfNumbersInRange2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number intial value");
		int iR=sc.nextInt();
		
		System.out.println("Enter a number final value");
		int fR=sc.nextInt();
		
		int sum=0;
		
		for(int i=iR;i<=fR;i++) {
			sum+=i;
		}
		
		System.out.println("Sum of all numbers in range of "+iR+" & "+fR+" (inclusive) is :"+sum);
		
	}

}
