package controlstatement;

public class _4NestedIfelse {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=50;
		
		if(a>b) {
              if(a>c) {
			System.out.println(a);
		}else {
			System.out.println(c);
		}
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
	
		}
			
			

	}

}
