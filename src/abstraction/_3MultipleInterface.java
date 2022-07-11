package abstraction;

interface A{
	void input();
	void output();
	int a=20;
	int b=30;
}
interface B extends A{
	void cash();
	void money();
}


class C implements A,B{

	@Override
	public void cash() {
		System.out.println(a+b);
		
	}

	@Override
	public void money() {
		System.out.println(a*b);
		
	}

	@Override
	public void input() {
		System.out.println(a-b);
		
	}

	@Override
	public void output() {
	System.out.println(a/b);
		
	}
	
}
public class _3MultipleInterface {

	public static void main(String[] args) {
		C obj=new C();
		obj.cash();
		obj.input();
		obj.output();
		obj.money();

	}

}
