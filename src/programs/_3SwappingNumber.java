package programs;

import java.util.Scanner;

public class _3SwappingNumber {

	public static void main(String[] args) {
          
		int a=20;
		int b=10;
		
		a=a+b;   //30
		b=a-b;   // 20
        a=a-b;   //10
        
        System.out.println(a);
        System.out.println(b);
        
        int m;
        int n;
        
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter value of m");
        
        m=ab.nextInt();
        System.out.println("Enter value on n");
        n=ab.nextInt();
       
        
        
        m=m+n;
        n=m-n;
        m=m-n;
        
        System.out.println(m);
        System.out.println(n);
	}

}
