package specialKeywords;

class AA{
	
	//when we want to call the parametrised cunstructor of superclass by using object of subclass
	AA(int a){
		System.out.println("Hello java");
	}
	
}

class BB extends AA{
	
	BB(){
		super(100);
		System.out.println("Hello tushar");
	}
}
public class _7superkeyword {

	public static void main(String[] args) {
		
		BB obj=new BB();
		

	}

}
