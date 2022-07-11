package programs;

import java.util.Scanner;
public class _6Factorialumber {

	public static void main(String[] args) {
		
		int a=5;
		int fact=1;
		
		for(int i=1;i<=5;i++) {
			fact=fact *i;
		}
       System.out.println(fact);
       
       
       int n;
       int facts=1;
       
       Scanner ab=new Scanner(System.in);
       System.out.println("Enter value");
       n=ab.nextInt();
       
       for(int j=1;j<=n;j++) {
       facts=facts *j;}
       System.out.println(facts);
	}

}
