package numbers;
import java.util.Scanner;

public class OddNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the initialr range:");
		
		System.out.println("Enter the final range:");
		int ir=s.nextInt();
		int fr=s.nextInt();
		for(int i=ir; i<=fr; i++)
		{
		if(i%2!=0)
		{
		System.out.println("odd num is:"+i);
}
}
}
}

