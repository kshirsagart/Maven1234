package specialKeywords;

class A{
	// when the name of method  is same in superclass and subclass 
	
	void show() {
		System.out.println("Hello java");
	}
}

class B extends A{
	
	void show() {
		super.show();
		System.out.println("Hello tushar");
	}
	
}
public class _6superkeyword {

	public static void main(String[] args) {
	  B obj=new B();
	  obj.show();

	}

}
