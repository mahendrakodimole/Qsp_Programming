package array._2DArray;

import java.util.Scanner;

public class RowWithMax1 {
	/*given an boolean array where each row is sorted , find the row with the
	 * maximum number of 1
	 * 
	 * */
public static void main(String[] args) {
	
	int arr[][]= {
			{0,1,1,1},
			{0,0,1,1},
			{1,1,1,1}
	};
	
	int arr1[][]= {
			{0,1},
			{1,1}
			};
	
	System.out.println(findRowWithMax1(arr));
	System.out.println(findRowWithMax1(arr1));
	
}
private static int findRowWithMax1(int arr[][]){
	int max=0;
	int lastCount=0;
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==1) {
				count++;
				}
		}
		if(count>lastCount){
			max=i;
			lastCount=count;
		}
	} 
	return max;
}
}
