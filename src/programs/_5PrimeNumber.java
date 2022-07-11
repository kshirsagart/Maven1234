package programs;

import java.util.Scanner;

public class _5PrimeNumber {

	public static void main(String[] args) {
		
		int a=7;
		int count=0;
		
		for(int i=1;i<=7;i++) {
			if(a%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not Prime Number");
			}
			
			
			int n;
			int cont=0;
			
			System.out.println("Enter value");
			Scanner ab=new Scanner(System.in);
			n=ab.nextInt();
			
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					cont++;
				}
				}if(cont==2) {
					System.out.println("Prime number");
				}else {
					System.out.println("Not prime number");
				}
				
				
		}

	}


