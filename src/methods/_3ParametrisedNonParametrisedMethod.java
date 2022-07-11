package methods;

public class _3ParametrisedNonParametrisedMethod {

	void main(int i) {
		System.out.println(i);
	}
	
	void show() {
		System.out.println("hello java");
	}
	
	
	public static void main(String[] args) {
		
		_3ParametrisedNonParametrisedMethod obj=new _3ParametrisedNonParametrisedMethod();
		obj.main(50);
		obj.show();

	}

}
