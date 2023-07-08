

package numbers;

import java.util.Scanner;

public class printOddByRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Initial range value");
		int iR=sc.nextInt();
		
		System.out.println("Enter Initial range value");
		int fR=sc.nextInt();
		
		for(int i=iR;i<=fR;i++) {
			if(!(i%2==0))
			System.out.println(i);
		}
	}
}
