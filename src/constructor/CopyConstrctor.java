package constructor;

class A{
	int a=20;
	int b=30;
	A(){
		System.out.println(a+b);
	}
	
	A(A ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+b);
	}

		
	
}
public class CopyConstrctor {

	
	public static void main(String[] args) {
		A obj=new A();
		A obj2=new A(obj);
		

	}

}
