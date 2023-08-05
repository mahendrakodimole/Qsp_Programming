package Strings;

public class StringCreation {
public static void main(String[] args) {
	String str=new String();
	System.out.println(str);
	
	String str1=new String("Hi");
	System.out.println(str1);
	
	char ch[]={'a','b'};
	String str2=new String(ch) ;
	System.out.println(str2);
	
	
	byte bytes[]= {65,97,57};
	String str3=new String(bytes);
	System.out.println(str3);
	
	int ints[]= {65,66,67,68,69,70,71,72,73,74};
	String str4=new String(ints,0,9);
	System.out.println(str4);
}
}
