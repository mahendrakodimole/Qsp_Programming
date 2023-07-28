package array;

import java.util.Arrays;
import java.util.Scanner;

public class NthLarget {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter array values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-2;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]==a[j+1]) {
					int temp=a[i];
					a[i]=a[j];
					a[i]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		System.out.println("Enter nth largest number");
		int n1=sc.nextInt();
		System.out.println(a[a.length-n1]);
		
	}
}
