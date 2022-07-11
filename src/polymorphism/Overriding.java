package polymorphism;

class Parent{
	void show() {
		int a=50;
		int b=100;
		System.out.println(a+b);
		System.out.println("Java");
	}
}
class Chield extends Parent{
	@Override
	void show() {
		int i=150;
		int j=30;
		System.out.println(i+j);
	}
}
public class Overriding {
	

	public static void main(String[] args) {
		Chield obj=new Chield();
		
		obj.show();
		

	}

}
