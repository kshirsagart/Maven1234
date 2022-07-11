package abstraction;

abstract class Parent{
	int a=20;
	int b=30;
	abstract void main();
	void show() {
		System.out.println(a+b);
	}
	
}

class chield extends Parent{

	@Override
	void main() {
		System.out.println(a+b);
		
	}
	
}
public class _1Abstractclass {

	public static void main(String[] args) {
		chield obj=new chield();
		obj.main();
		obj.show();
		
		
		

	}

}
