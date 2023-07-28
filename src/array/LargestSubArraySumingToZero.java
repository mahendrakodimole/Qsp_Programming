package array;

public class LargestSubArraySumingToZero {
public static void main(String[] args) {
	int n[]= {15,-2,2,-8,1,7,10,23};
	int length=0;
	int Largestlength=0;
	
	for(int i=0;i<n.length;i++) {
		int sum=0;
		for(int j=i;j<n.length;j++) {
			System.out.print(n[j]+" ");
			sum+=n[j];
			length=(j-i)+1;
			
			if(sum==0&&length>Largestlength) {
				Largestlength=length;
//				System.out.println("length:"+Largestlength);
			}
		}
//		System.out.println();
	}
	
	System.out.println(Largestlength);
}
}
