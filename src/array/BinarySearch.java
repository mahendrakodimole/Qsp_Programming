package array;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of Array");
	int n=sc.nextInt();
	int []a=new int[n];
	
	System.out.println("Enter array values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	for(int v:a) 
		System.out.println(v);
		
	System.out.println("Enter a value to search in the array");
	int key=sc.nextInt();
	
	search(key,a);
	System.out.println();
	search(a,key);
}



private static void search(int[] a, int key) {
	System.out.println("Method 2 ");
	int count=0,low=0,high=a.length-1,mid=(low+high)/2;
	boolean isPresent=false;
	while(mid>=low && mid<=high) {
		System.out.println("Iteration"+ ++count+ " mid:"+mid);
		if(key==a[mid]) {
			isPresent=true;
			break;
		}
		else if(key>a[mid]) 
			mid=mid+1;
		else if(key<a[mid]) 
			mid=mid-1;
		
	}
	System.out.println(isPresent?key+" is Present at index "+mid:key+" is not present");
}

private static void search(int key, int[] a) {
	System.out.println("Method 1");
	int count=0,low=0,high=a.length-1,mid=0;

	boolean isPresent=false; 
	
	while(high>=low) {
		mid=(low+high)/2; 
		System.out.println("Iteration"+ ++count+ " mid:"+mid);
		if(key==a[mid]) {
			System.out.println(key+" is present at index"+mid);
			isPresent=true;
			break;
		}else if(key>a[mid]) {
			low=mid+1;
		}else if(key<a[mid]) {
			high=mid-1;
		}
	} 
	if(!isPresent)
		System.out.println(key+" is not Present in the array");
}

}
