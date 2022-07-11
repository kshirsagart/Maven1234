package programs;

import java.util.Scanner;

public class _2PositiveNegativeNumber {

	public static void main(String[] args) {
		
		int a=-10;
		if(a>0) {
			System.out.println("Postive number");
		}else {
			System.out.println("Negative number");
		}
		
		
		int n;
		System.out.println("Enter value");
        Scanner ab=new Scanner(System.in);
        n=ab.nextInt();
        
        if(n>0) {
        	System.out.println("Positive number");
        }else {
        	System.out.println("Negative number");
        }
        
        
        
	}

}
