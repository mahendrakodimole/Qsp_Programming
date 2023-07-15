package numbers;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number greater than zero:");
	int n=sc.nextInt();
	/*suhas k s
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println(n+" is not Prime number\n");
			break;
		}else {
			System.out.println(n+" is Prime number\n");
			break;
		}
	}*/
	
	boolean isPrime=true;
	if(n>0&&n!=1) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
	}else 
		isPrime=false;
	
		System.out.println(n+(isPrime?" is a Prime Number":" is not a prime number"));

}
}
