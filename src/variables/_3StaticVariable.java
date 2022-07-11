package variables;

public class _3StaticVariable {
	static int a=20;   // static variable
	static int b=50;
	

	public static void main(String[] args) {
		_3StaticVariable obj=new _3StaticVariable();
		System.out.println(a);   // loading directly
		System.out.println(b);
		System.out.println(_3StaticVariable.a);  // loading with class file
		System.out.println(_3StaticVariable.b);
		System.out.println(obj.a);    // loading with obj reference
		System.out.println(obj.b);
		
		

	}

}
