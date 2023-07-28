package pattern.mahendra;

import java.util.Scanner;

public class SquareHallow {
	/*
	 
	* * * * * *
	*         * 
	*         *
	*         *
	*         *
	* * * * * *
	
	*/
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of hollow square");
		int size=sc.nextInt();
		
	draw(size);
		
	}

	private static void draw(int size) {
		for (int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(i==1||i==size) {
					System.out.print(" *");
				}else if(i>1||i<size) {
					if(j==1||j==size) {
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
