package array._2DArray;

import java.util.Scanner;

public class MatricesMultiplication {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	int c[][]= {{1,2},{3,4},{5,6}};
	int d[][]= {{1,2,3},{4,5,6}};
	
	multiply(a,b);
	multiply(c,d);
	
	}

	private static void multiply(int[][] a, int[][] b) {
		int row1=a.length;
		int col1=a[0].length;
		
		int row2=b.length;
		int col2=b[0].length;
		
		if(a[0].length!=b.length) {
			System.out.println("Matrices multiplication not possible");
			return ;
		}
		
		int c[][]=new int[a.length][b[0].length];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				// b[i].length <- this gives IndexOutOfBounds some time
				for(int k=0;k<row2;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
