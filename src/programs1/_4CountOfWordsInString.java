package programs1;

public class _4CountOfWordsInString {

	public static void main(String[] args) {
		
		String ss="My Name Is Akash";
		int count=1;
		
		for(int i=0;i<ss.length()-1;i++) {
			if((ss.charAt(i)==' ')&&(ss.charAt(i+1)!=' ')){
				count++;
			}
		}
			System.out.println("Number of words in string:" +count );
		
			


         String a="My name is tushar";
         char ch[]=a.toCharArray();
         int space=0;
         
         for(int i=0;i<a.length();i++) {
        	 if(Character.isSpace(ch[i])) {
        		 space++;
        	 }
         }
         System.out.println("space:" + space);
		
		
	}	
}