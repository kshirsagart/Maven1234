package programs1;

public class _6PalimdromUsingString {

	public static void main(String[] args) {
		
		String ss="madam";
		String rev="";
		
		for(int i=ss.length()-1;i>=0;i--) {
			rev=rev+ss.charAt(i);
		}if(ss.equals(rev)) {
			System.out.println("Palindrom String");
		}else {
			System.out.println("not Palindrom String");
		}
		
	}
}

