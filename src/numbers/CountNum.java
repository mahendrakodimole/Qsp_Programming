package numbers;



import java.util.Scanner;

public class CountNum{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
}
}