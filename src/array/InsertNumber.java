package array;

import java.util.Scanner;

public class InsertNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]= {10,20,30,40,50,60};
	
	System.out.println("Enter Number");
	int num=sc.nextInt();
	
	System.out.println("Enter index");
	int index=sc.nextInt();
	
	a[index]=num;
	
	for(int n:a) {
		System.out.print(n+" ");
	}
	
}
}
