package wrapperclass;

public class _1Autoboxing {
	
	// converting primitive data type to object

	public static void main(String[] args) {
	
		int a=50;  // primitive
		Integer ss=new Integer(a);  // object
		System.out.println(ss);
		//or
		Integer kk=a;
		System.out.println(kk);
		
		
		char b='A';   // primitives
		Character bb=new Character(b); // object
		System.out.println(bb);
		
		//or 
		Character cc=b;
		System.out.println(cc);

	}

}
