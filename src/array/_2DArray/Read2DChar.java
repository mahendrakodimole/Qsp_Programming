package array._2DArray;

import java.util.Scanner;

public class Read2DChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row value");
	int row=sc.nextInt();
	System.out.println("Enter col value");
	int col=sc.nextInt();
	
	char ch[][]=new char[row][col];
	System.out.println("Enter char values");
	for(int i=0;i<ch.length;i++) {
		for(int j=0;j<ch[i].length;j++) {
			ch[i][j]=sc.next().charAt(0);
		}
	}
	
	for(int i=0;i<ch.length;i++) {
		for(int j=0;j<ch[i].length;j++) {
			System.out.print(ch[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
