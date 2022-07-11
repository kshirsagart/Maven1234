package specialKeywords;

public class _2thiskeyword {
	//when we want to call the default constructor by using object of parametrised constructor
	
	_2thiskeyword (){
		System.out.println("hello java");
	}
	
	_2thiskeyword (int a){
		this();
		System.out.println("Hello tushar");
	}

	public static void main(String[] args) {
	
		_2thiskeyword obj=new _2thiskeyword (100);

	}

}
