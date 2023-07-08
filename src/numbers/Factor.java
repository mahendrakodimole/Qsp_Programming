package numbers;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to find factor");
		int n=sc.nextInt();
		
		System.out.println("Factors of "+n+" are :\n"+1);
		for(int i=2;i<=(n/2);i++) {
			if(n%i==0) {
			System.out.println(i);
			}
		}
		System.out.println(n);
		
	}
}
