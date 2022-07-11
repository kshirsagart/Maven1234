package string;

public class _1StringLiterals {

	public static void main(String[] args) {
		
		String a="Ankit";
		String b="rahul";
		String c="  ankush  ";
		String d="";
		String e="Ankit";
		
		//methods
	   System.out.println(a.toLowerCase());
	   System.out.println(b.toUpperCase());
	   
	   System.out.println(b.concat(a));
	   System.out.println(a.length());
	   
	   
	   System.out.println(c.trim());
	   System.out.println(d.isEmpty());
	   
	   
	   System.out.println(d.isBlank());
	   System.out.println(a.charAt(3));
	   
	   System.out.println(b.indexOf('h'));
	   System.out.println(a.equals(b));
	   
	   System.out.println(a.compareTo(b));
	   System.out.println(c.replace('k', 'a'));
	   
	   System.out.println(b.substring(1, 3));
	   System.out.println(b.substring(0));
	   
	   System.out.println(a==e);
	   
	   
	   
	   
	   
		
	   
	   

	}

}
