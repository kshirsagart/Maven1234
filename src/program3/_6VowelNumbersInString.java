package program3;

public class _6VowelNumbersInString {

	public static void main(String[] args) {
		
		String ss="I Am Tushar";
		int count=0;
		
		for(int i=0;i<ss.length();i++) {
			
			switch(ss.charAt(i))
			{
			case 'A':
			case 'a':
			case 'm':
			case 'i':
			case 's': count++;
			}	
		}
		System.out.println(count);
			
				
				
				
				
			
		

	}

}
