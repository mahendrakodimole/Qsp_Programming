package array._2DArray;

import java.util.Scanner;

public class InterchangeAnyTwoRows {
	/*take two row numbers from user(not index)
	 * interchange the two row values
	 * */
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//int a[][]=createArray();
		int a[][]={ {2,1,4},{1,2,3},{3,6,2}};
		int b[][]= {{2,1,4},{1,2,3}};
		int c[][]= {{2,1},{1,2},{3,6}};
		interchange(a);
		interchange(b);
		interchange(c);
	}

	private static void interchange(int[][] a) {
		System.out.println("************************************");
		System.out.println("Before interchange");
		print(a);
		
		System.out.println("Enter 1st row number to interchange");
		int k=sc.nextInt();
		System.out.println("Enter 2nd row number to interchange");
		int l=sc.nextInt();
		
		System.out.println("K="+k+" L="+l);
		
		int row1=k-1;
		int row2=l-1;
		int temp[]=new int[a[row1].length];
		
		
		for(int j=0;j<a[row1].length;j++) {
			temp[j]=a[row1][j];
			a[row1][j]=a[row2][j];
			a[row2][j]=temp[j];
		}
	
		System.out.println("After interchange");
		print(a);
		System.out.println("************************************\n");
	}
	private static void print(int[][] b) {
		System.out.println("Array elements are:");
		for(int i[]:b) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static int[][] createArray(){
		System.out.println("Enter rows of an array");
		int r=sc.nextInt();
		System.out.println("Enter cols of an array");
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
}
