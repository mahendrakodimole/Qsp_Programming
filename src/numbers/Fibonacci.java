package numbers;
import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first  number:");
		int num1=s.nextInt();
		System.out.println("Enter the last  number:");
		int num2=s.nextInt();
		int num3=0;
		System.out.println(num1+""+num2);
		for(int i=0; i<=10; i++)
	    num3=num1+num2;
		System.out.println(num3);
			num1=num2;
			num2=num3;


}
}