package programs1;

public class _2PalindromNumber {

	public static void main(String[] args) {
		
		int n=121;
		int c,r,s=0;
		c=n;
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}if(c==s) {
			System.out.println("Palindrom Number");
		}else {
			System.out.println("Not Palindrom number");
		}

	}

}
