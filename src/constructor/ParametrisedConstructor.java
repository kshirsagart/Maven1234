package constructor;

class ABC{
	
	ABC(){
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	
	ABC(int a,int b){
		this();
		System.out.println(a+b);
		
	}
}
public class ParametrisedConstructor {

	public static void main(String[] args) {
          ABC obj=new ABC(50,100);

	}

}
