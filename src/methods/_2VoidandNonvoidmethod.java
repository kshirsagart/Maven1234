package methods;

public class _2VoidandNonvoidmethod {
	
	void  money() {     // void method
		System.out.println("Hello java");
	}
	
	int cash() {              // non void method
		System.out.println("Hello c++");
		return 50;
	}

	public static void main(String[] args) {
		
		_2VoidandNonvoidmethod obj=new _2VoidandNonvoidmethod();
		obj.money();
		obj.cash();
		

	}

}
