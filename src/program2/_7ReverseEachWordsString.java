package program2;

import java.util.Scanner;

public class _7ReverseEachWordsString {

	public static void main(String[] args) {
		
		
		String ss="My name is tushar";
		String rev="";
		
		int length=ss.length();
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+ss.charAt(i);
		}
		System.out.println(rev);
		
		
		
		String s;
		String r="";
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter String");
		s=ab.nextLine();
		
	for(int j=ss.length()-1;j>=0;j--) {
		r=r+ss.charAt(j);
	}	
System.out.println(r);
	
	}
}
