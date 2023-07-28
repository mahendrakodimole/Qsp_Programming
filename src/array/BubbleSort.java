package array;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {3,2,6,5,2,8,9,7,1};
	int copy[]=a.clone();
		
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		//this print function is just to visualize swapping
		printAll(a); 
	}

	System.out.println("Unsorted Array");
	printAll(copy);
	System.out.println("Sorted Array");
	printAll(a);
}
static void printAll(int a[]) {
	for(int v:a) {
		System.out.print(v+" ");
	}
	System.out.println();
}
}
