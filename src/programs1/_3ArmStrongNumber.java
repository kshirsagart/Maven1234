package programs1;

public class _3ArmStrongNumber {

	public static void main(String[] args) {
		
		int n=153;
		int c,r,s=0;
		c=n;
		
		while(n>0) {
			r=n%10;
			s=(r*r*r)+s;
			n=n/10;
		}
		if(c==s) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}

	}

}
