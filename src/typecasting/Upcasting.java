package typecasting;
class parent{
	int a=20;
	int b=30;
	void show() {
		System.out.println(a);
	}
	
	
	
}
class chield extends parent{
	int i=50;
	int j=100;
	void money() {
		System.out.println(i+j);
	}
	
	
}
public class Upcasting {

	public static void main(String[] args) {
		parent obj=new chield();  //upcasting
		obj.show();
		obj.a=10;
		obj.b=20;
		

	}

}
