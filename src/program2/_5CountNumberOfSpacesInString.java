package program2;

public class _5CountNumberOfSpacesInString {

	public static void main(String[] args) {
	
		
		String ss="My name is Tushar 123 @";
				char a[]=ss.toCharArray();
				int letters=0,space=0,number=0,others=0;
				
				for(int i=0;i<a.length;i++) {
					if(Character.isLetter(a[i])) {
						letters++;
					}
				
					else if(Character.isSpace(a[i])) {
						space++;
					}
						else if(Character.isDigit(a[i])) {
							number++;
							
						}
						
						else {
							others++;
						}			
					}
					System.out.println(ss);
					System.out.println("Letters" + letters);
					System.out.println("space" + space);
					System.out.println("digit" + number);
					System.out.println("number" + others);
				
				
				
	}
	}


