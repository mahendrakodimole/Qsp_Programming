package array._2DArray;

import java.util.Scanner;

public class Matrices_Addition {
	static Scanner sc;
public static void main(String[] args) {
	sc=new Scanner(System.in);
	System.out.println("Enter array size ex: 3");
	int size=sc.nextInt();
	
	int a[][]=new int[size][size];
	int b[][]=a.clone();
	
	a=readValues(a);
	b=readValues(b);
	
	System.out.println("Array : a");
	print(a);
	System.out.println("Array : b");
	print(b);
	
	int [][]c=addMatrices(a,b);
	System.out.println("Array (result of a+b) : c");
	print(c);
}

private static void print(int[][] c) {
	for(int i[]:c) {
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}

private static int[][] addMatrices(int[][] a, int[][] b) {
	int x=a.length;
	int y=a[0].length;
	
	int c[][]=new int[x][y];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	return c;
}

private static int[][] readValues(int[][] a) {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println("Enter value at index:"+i+","+j);
			a[i][j]=sc.nextInt();
		}
	}
	return a;
}

}
