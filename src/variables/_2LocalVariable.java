package variables;

public class _2LocalVariable {
	void show() {
		int a=20;  // local variable
		int b=10;
		System.out.println(a+b);  // load variable loading directly
	}
	
	void call(int j,int k) {  // local variable
		System.out.println(j+k);
	}
	

	public static void main(String[] args) {
		_2LocalVariable obj=new _2LocalVariable();
		obj.show();
		obj.call(50, 50);
		
		
		int i=20;   // local variable
	int	j=30;
		System.out.println(i+j);
		
	

	
	}
}
