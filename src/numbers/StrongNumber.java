package numbers;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check Strong number or not...");
	int n=sc.nextInt();
	int temp=n;
	int sumOfFact=0;
	
	while(n>0) {
		int fact=1;
	for(int i=1;i<=n%10;i++) {
		fact*=i;
	}
	sumOfFact+=fact;
	n/=10;
	}
	System.out.println(temp+" is "+(sumOfFact==temp?"a Strong number":"Not a Stron number"));
	
}
}
