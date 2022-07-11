package typecasting;

class Parent1{
	int a=20;
	int b=30;
	void show() {
		System.out.println(a+b);
	}
}
class chield1 extends Parent1{
	int i=30;
	int j=50;
	void money() {
		System.out.println(i+j);
	}
}
public class Downcasting {

	public static void main(String[] args) {
		Parent1 obj=new chield1();  // upcasting
		obj.show();
		obj.a=30;
		obj.b=50;
	//	chield1 a=new Parent1();   // downcasting by implicity cannot possible
	  chield1 a=(chield1)obj;      // downcasting by explicity
	  a.show();
	  a.money();
	  a.a=50;
	  a.b=30;
	  a.i=80;
	  a.j=70;

	}

}
