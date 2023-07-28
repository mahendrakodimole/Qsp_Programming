package array._2DArray;

import java.util.Scanner;

public class ReadString_To_2D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows number of an Array");
	int r=sc.nextInt();
	System.out.println("Enter cols number of an Array");
	int c=sc.nextInt();
	sc.nextLine();
	String a[][]=new String[r][c];
	
	System.out.println("Enter array values");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			a[i][j]=sc.nextLine();
		}
	}
	
	System.out.println("Array Vlaues");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
