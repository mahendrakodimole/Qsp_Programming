package array._2DArray;

import java.util.Scanner;

public class TransposeOfMatrices {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row size");
	int row=sc.nextInt();
	System.out.println("Enter col size");
	int col=sc.nextInt();
	int a[][]=new int[row][col];

	System.out.println("Enter array values");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Before Transpose");
	print(a);
	
	int b[][]=transpose(a);
	System.out.println("After Transpose");
	print(b);
}

private static void print(int[][] b) {
	for(int i[]:b) {
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}

private static int[][] transpose(int[][] a) {
	int row=a.length;
	int col=a[0].length;
	
	//transposed
	int b[][]=new int[col][row];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			b[j][i]=a[i][j];
		}
	}
	
	return b;
}

}
