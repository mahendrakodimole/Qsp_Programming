package array;

import java.util.Scanner;

public class AcceptOnlyUniqueValues {
	static Scanner sc;
public static void main(String[] args) {
	sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=sc.nextInt();
	
	int[] a=new int[size];
	a=takeInput(a);	
	
	System.out.println("Array values are:");
	for(int v:a) 
		System.out.print(v+" ");
	
}	
private static int[] takeInput(int[] a) {
	
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter "+(i+1)+" value ");
			int n=0;
			do{
				n=sc.nextInt();
			}while(isPresent(n,a));
			a[i]=n;
		}	
	return a;
	}

	static boolean isPresent(int n, int[] a) {
		for(int key:a) {
			if(key==n) {
				System.out.println("   "+n+" is Duplicate \n"
						+ "     duplicates are not allowed :(");
				return true;
			}
		}
		return false;
	}
}
