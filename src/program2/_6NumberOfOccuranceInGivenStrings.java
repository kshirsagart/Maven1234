package program2;

public class _6NumberOfOccuranceInGivenStrings {

	public static void main(String[] args) {
		
		String s="java is java again java again";
		char ch='a';
		
		int count=s.length() -s.replace("a", "").length();
		
		System.out.println("Number of occurance of 'a'"+ count);

	}

}
