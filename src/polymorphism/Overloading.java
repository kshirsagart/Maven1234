package polymorphism;

public class Overloading {
	void cash() {
		System.out.println("Hello java");
	}
	void cash(int i,int j) {
		System.out.println(i+j);
		System.out.println("Hello tushar");
	}
	void cash(int i,float j) {
		System.out.println("Hello c++");
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.cash();
		obj.cash(10, 20);
		obj.cash(50, 100);
	

	}

}
