package pattern.mahendra;

import java.util.Scanner;

public class LeftHalfPyramid {
/*
 * 				   *
 * 			     * *
 *             * * *
 *           * * * *
 * 
 */
	public static void main(String[] args) {
		System.out.println("Enter size of Left Half Pyramid");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			draw(size);
	}

private static void draw(int size) {
	for(int i=1;i<=size;i++) {
		for(int j=1;j<=size;j++) {
			if(j>size-i) {
				System.out.print(" *");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}

}
