package string;

public class _4StringBuilder {

	public static void main(String[] args) {
	
		StringBuilder a=new StringBuilder("Akash");
		StringBuilder b=new StringBuilder("Akash");
		StringBuilder c=new StringBuilder("Tushar");
		StringBuilder d=new StringBuilder("Amol");
		
		
		//methods
		System.out.println(a.append(c));
		System.out.println(a==b);
		
		System.out.println(a.equals(b));
		System.out.println(b.compareTo(a));
		
		System.out.println(c.indexOf("s"));
		System.out.println(c.capacity());
		
		System.out.println(d.isEmpty());
		System.out.println(d.length());
		
		System.out.println(c.lastIndexOf("r"));
		System.out.println(c.substring(1, 4));
		
		System.out.println(d.replace(0, 3, "akash"));
		
		

	}

}
