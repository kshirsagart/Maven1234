package program3;

public class SimpleHarmonicSeries {

	public static void main(String[] args) {
		
		
		int n=4;
		int i=1;
		double r=0.0;

		while(i<=n) {
			System.out.println("1/"+i+"+");
			r=r+(double)1/i;
			i++;
		}
		System.out.println("Sum Of Harmonic Series is"+ r);

	}

}
