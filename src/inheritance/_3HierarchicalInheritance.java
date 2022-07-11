package inheritance;

class AA{
	int a=20;
	int b=80;
	void money() {
		System.out.println(a+b);
	}
	
	
}
class BB extends AA{
	int j=20;
	int k=10;
	void show() {
		System.out.println(a+b);
		System.out.println(k+j);
	}
	
}
class CC extends AA{
	void cash() {
		System.out.println(a+b);
	
	}
	
}
class DD extends AA{
	void call() {
		System.out.println(a*b);
	}
	
}
public class _3HierarchicalInheritance {

	public static void main(String[] args) {
		DD obj=new DD();
		obj.call();
	    obj.money();
		
		

	}

}
