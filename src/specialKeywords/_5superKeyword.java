package specialKeywords;

class Parent{
	
	// when the name of variable is same in super class and subclass
	
	int a=20;
}

class Chield extends Parent {
	
	int a=50;
	
	void show(int a) {
		System.out.println(a);      // local variable
		System.out.println(this.a);  // instance variable
		System.out.println(super.a);  // parent class variable
	}
}
public class _5superKeyword {
	

	public static void main(String[] args) {
		Chield obj=new Chield();
		obj.show(30);

	}

}

	
	
	















