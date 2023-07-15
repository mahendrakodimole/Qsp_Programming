package numbers;
import java.util.Scanner;

public class EvenRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the initialr range:");
		
		System.out.println("Enter the final range:");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a; i<=b; i++)
		{
		if(i%2==0)
		{
		System.out.println(i);
}
}
}
}
