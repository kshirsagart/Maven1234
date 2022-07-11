package program2;

import java.util.Scanner;

public class _8MultiplicationTable {

	public static void main(String[] args) {
		
	int n=6;
		
		for(int i=1;i<=10;i++) {
		
			System.out.println(n+"*"+i+"="+n*i);
			
		}
		
		int a;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the number");
		a=ab.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
		
	}

}
