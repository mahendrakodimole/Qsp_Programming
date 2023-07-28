package array;

public class DuplicateElements {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,1,6,8,9,8};
		boolean duplicate[]=new boolean[a.length];
		
		
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(!duplicate[i]) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						duplicate[j]=true;
						count++;
					}
				}
				if(count>0)
				System.out.println(a[i]+" is Duplicate present at index "+i);
			}
		}
	}
}
