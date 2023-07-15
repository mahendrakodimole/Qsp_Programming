package numbers;
import java.util.Scanner;

public class ProductDigitsNum{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int product=1;
		while(num>0)
		{
			int dig=num%10;
			product=product*dig;
			num=num/10;
		}
		
			
    System.out.println("product of digit is:"+product);
	}		
}

