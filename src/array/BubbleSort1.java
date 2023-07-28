package array;

public class BubbleSort1 {
//but it's selection sort
	public static void main(String[] args) {
		int a[]= {3,2,6,5,2,8,9,7,1};
		int copy[]=a.clone();
			
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
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
