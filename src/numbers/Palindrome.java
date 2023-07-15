package numbers;

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int rev=0;
		int temp=num;
		while(num!=0) {
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		if(rev==temp)
		{	
    System.out.println("palindrome");
	}
		else
		{
			System.out.println("not palindrome");
		}
}
}