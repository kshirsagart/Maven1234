package typecasting;

class AAA{
	int a=10;
	int b=30;
	void show() {
		System.out.println(a+b);
	}
	
}
class BBB extends AAA{
	int i=30;
	int j=40;
	@Override
	void show() {
		super.show();
		System.out.println(i+j);
	}
	
}
public class WithOverride {

	public static void main(String[] args) {
		AAA obj=new BBB();  // upcasting
		
		obj.show();
		obj.a=50;
		obj.b=40;
		
  //		BBB a=new AAA(); 
		   BBB a=(BBB)obj;
		   a.show();
		   a.a=20;
		   a.b=50;
		   a.i=40;
		   a.j=30;

	}

}
