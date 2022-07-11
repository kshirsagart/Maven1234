package inheritance;

class A{
	int a=10;
	int b=20;
	void show() {
		System.out.println(a+b);
	}
	
}
class B extends A{
	int j=10;
	int k=80;
	void money() {
		System.out.println(j+k);
		System.out.println(a*b);
	}
	
	
	
}
class C extends B{
	void cash() {
		System.out.println(b-a);
		System.out.println(k-j);
	}
}

class D extends C{
	void call() {
		System.out.println(j*k);
	}
	
	
}
public class _2MultilevelInheritance {

	public static void main(String[] args) {
		D obj=new D();
		obj.show();
		obj.money();
		obj.cash();
		obj.call();
		

	}

}
