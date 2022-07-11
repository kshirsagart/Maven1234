package abstraction;

interface AA{
	int a=20,b=50;
	void input();
	void output();
	
}
class BB implements AA{

	@Override
	public void input() {
		System.out.println(a+b);
		
	}

	@Override
	public void output() {
		System.out.println(a*b);
		
	}
	
}
public class _2Interface {

	public static void main(String[] args) {
		BB obj=new BB();
		obj.input();
		obj.output();
	   

	}

}

	




