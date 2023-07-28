package array;

import java.util.Scanner;

public class FirstAndLastOccurenceIndex {
	/*find the index of first and last occurrence of given element
	 *   in the array in single iteration 
	 * 
	 * */
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int size=sc.nextInt();
	int a[]= new int[size];
	
	System.out.println("Enter array values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	int count=0;
	int firstIndex=0;
	int lastIndex=0;
	
	System.out.println("Enter key");
	int key=sc.nextInt();
	
	for(int i=0;i<a.length;i++) 
		if(key==a[i]) 
			if(count==0) {
				firstIndex=i;
				count++;
				}else lastIndex=i;
	
	System.out.println("First index="+firstIndex+
			" Last index="+lastIndex);
	sc.close();
}
}
