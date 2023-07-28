package array._2DArray;

import java.util.Scanner;

public class Identity_Matrice {
	/*Square matrix in which principal diagonal elements are 1 and rest of the
	 * elents are zero 
	 * 
	 * {
	 *	 {1,0,0},
	 *	 {0,1,0},
	 * 	 {0,0,1}
	 * }

	 * */
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array");
	int size=sc.nextInt();
	int a[][]=new int[size][size];
	
	for(int i=0;i<a.length;i++) 
		for(int j=0;j<a[i].length;j++) 
			if(i==j)
				a[i][j]=1;
			else
				a[i][j]=0;
		
	System.out.println("Identity Array");
	for(int i[]:a) {
		for(int j:i) 
			System.out.print(j+" ");
		
		System.out.println();
	}
	
}
}
