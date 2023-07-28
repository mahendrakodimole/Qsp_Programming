package Strings;
/*find all substrings of abbc
 * 
 * a
 * ab
 * abb
 * abbc
 * b
 * bb
 * bbc
 * b
 * bc
 * c
 * */
public class AllSubStringsOfStrings {

	public static void main(String[] args) {
		String str="abbc";
		
		while(str.length()>0) {
		for(int i=0;i<str.length();i++) {
			
			String str1="";
			for(int j=0;j<=i;j++) {
				str1+=str.charAt(j);
			}
			System.out.println(str1);
		}
		//updation -remove first letter in every iteration
		str=subString(str);
		}
	}

	private static String subString(String str) {
		
		String temp="";
		for(int i=1;i<str.length();i++) {
			temp=temp+str.charAt(i);
		}
		return temp;
	}
}
