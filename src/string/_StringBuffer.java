package string;

public class _StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer a=new StringBuffer("Ankit");
		StringBuffer b=new StringBuffer("Tushar");
		StringBuffer c=new StringBuffer("Tushar");
		StringBuffer d=new StringBuffer("Akash");
		
		
		//append use for concate
		//capacity of string buffer is 16
		//reverse method is already exist
	   System.out.println(a.capacity());
	   System.out.println(a.length());
	   
	   System.out.println(a.charAt(2));
	   System.out.println(b.equals(c));
	   
	   System.out.println(a.indexOf("k"));
	   System.out.println(a.reverse());
	   
	   System.out.println(a.isEmpty());
	   System.out.println(a.substring(1));
	   
	   System.out.println(c.substring(1, 4));
	   
	   System.out.println(d.replace(0, 5, "amol"));
	   
	   System.out.println(a.append(b));
	   System.out.println(c.append(d));
	   
	   System.out.println(d.append(d));
		

	}

}
