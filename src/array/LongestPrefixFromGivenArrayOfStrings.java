package array;

public class LongestPrefixFromGivenArrayOfStrings {
public static void main(String[] args) {
	String arr[]= {"Atimi","AtimiIndia","AtimiCanada","AtimiBangalore"};
	String arr1[]= {"hello","world"};

	String longestPrefix=getLongestPrefix(arr);
	System.out.println(longestPrefix.length()>0?longestPrefix:-1);
	
	 longestPrefix=getLongestPrefix(arr1);
	System.out.println(longestPrefix.length()>0?longestPrefix:-1);
}

private static String getLongestPrefix(String[] arr) {
	String prefix="";
	for(int i=0;i<arr.length-1;i++) {
		String temp="";
		String str1=arr[i];
		String str2=arr[i+1];	
		for(int j=0;j<str1.length()&&j<str2.length();j++) {
			if(str1.charAt(j)==str2.charAt(j)) {
				temp+=str1.charAt(j);
			}else break;
			}
		if(temp.length()>prefix.length()) {
			prefix=temp;
		}
	}
	return prefix;
}

}
