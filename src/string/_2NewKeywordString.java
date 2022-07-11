package string;

public class _2NewKeywordString {

	public static void main(String[] args) {
		
		String a=new String("Ankit");
		String b=new String("Tushar");
		String d=new String("Ankit");
		String e="  My name is tushar";
		
		String c=a+" "+b;
		System.out.println(c);
		
		System.out.println(a==d);
		System.out.println(a.equals(d));
		
		System.out.println(a.compareTo(d));
		System.out.println(b.toLowerCase());
		
		System.out.println(e.toUpperCase());
		System.out.println(e.isBlank());
		
		System.out.println(e.isEmpty());
		System.out.println(e.trim());
		
		System.out.println(e.replace(" ", ""));
		System.out.println(e.replace('a', 't'));
		
		System.out.println(d.substring(1, 4));
		System.out.println(d.substring(1));
		
		System.out.println(e.endsWith("ar"));
		System.out.println(e.indexOf('a'));
		
		System.out.println(e.charAt(3));
		System.out.println(e.toCharArray());
		
		System.out.println(e.lastIndexOf('r'));
		System.out.println(e.replaceFirst("", "a"));
		
		System.out.println(e.strip());
		

	}

}
