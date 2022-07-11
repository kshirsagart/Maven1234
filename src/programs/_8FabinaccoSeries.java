package programs;

public class _8FabinaccoSeries {

	public static void main(String[] args) {
		
		int n=5,a=0,b=1,c;
		
		for(int i=0;i<=5;i++) {
			System.out.print(" "+a);
			
			c=a+b;
			a=b;
			b=c;
		}

	}

}
