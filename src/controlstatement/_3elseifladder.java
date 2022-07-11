package controlstatement;

public class _3elseifladder {

	public static void main(String[] args) {
		int marks=35;
		
		if(marks>=80) {
			System.out.println("Topper");
		}else if(marks>=60 && marks<80) {
			System.out.println("Second");
		}else if(marks>=50 && marks<60) {
			System.out.println("Third");
		}else {
			System.out.println("pass");
		}

	}

}
