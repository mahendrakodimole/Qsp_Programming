package numbers;

import java.util.Scanner;

public class ArmStrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check armstrong or not");
	int n=sc.nextInt();
	int temp1=n,temp2=n,sum=0,count=0;
	while(temp1>0) {
		count++;
		temp1 /=10;
	}
	
	while(temp2>0) {
		int product=1;
		for(int i=1;i<=count;i++) {
			product*=temp2%10;
		}
		sum+=product;
		temp2/=10;
	}

	System.out.println(sum==n?n+" is ArmStrong Number":n+" is not a ArmStrong Number");
}
}
