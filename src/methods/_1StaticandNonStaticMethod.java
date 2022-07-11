package methods;

public class _1StaticandNonStaticMethod {
	
	  void show() {    // non static method
		  System.out.println("Hello java");
	  }
	  
	  static void money() {   // static method
		  System.out.println("hello c++");
	  }

	public static void main(String[] args) {
		_1StaticandNonStaticMethod obj=new _1StaticandNonStaticMethod ();
		obj.show();  // non static method run with object reference
		
		money();    // static method run with directly
		
	

	}

}
