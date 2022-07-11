package specialKeywords;

public class _1thiskeyword {
	
	      //when the name of instance variable and local variable is same in same class.
	
	int a;
	
	_1thiskeyword(int a){
	
		this.a=a;
	}
	
	void show() {
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
          
		_1thiskeyword obj=new _1thiskeyword(100);
		obj.show();
		
		
		

	}

}
