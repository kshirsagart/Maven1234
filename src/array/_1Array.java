package array;



public class _1Array {

	public static void main(String[] args) {
		
		char a[]=new char[5];   // static array
		
		a[0]='A';
		a[1]='k';
		a[2]='a';
		a[3]='s';
		a[4]='h';
		
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a.length);
		System.out.println(a.clone());
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
								
		String ss=new String(a);
		System.out.println(ss);
		
		
		int b[]= {10,20,30,40,50};   // dynamic array
		
		System.out.println(b[3]);
		System.out.println(b.length);
		for(int c:b) {
			
			System.out.print(" "+c);
		}
		

	}

}
