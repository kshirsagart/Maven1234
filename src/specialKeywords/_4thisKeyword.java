package specialKeywords;

public class _4thisKeyword {
	//when we want to check the reference object are same or name

	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		
		_4thisKeyword obj=new _4thisKeyword ();
		System.out.println(obj);
		obj.show();

	}

}
