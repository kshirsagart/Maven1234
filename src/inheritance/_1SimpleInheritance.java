package inheritance;

class Parent{
	int a=20;
	int b=30;
	void show() {
		System.out.println(a+b);
	}
}

class Chield extends Parent{   // IS-A relationship
	int i=80;
	int j=20;
	void money() {
		System.out.println(i+j);
		System.out.println(a+b);
	}
	
}
public class _1SimpleInheritance {

	public static void main(String[] args) {
		Chield obj=new Chield();
		obj.show();
		obj.money();
		
		
		New a=new New(); // HAS A relationship or aggrrgation
		a.match();


	}

}
