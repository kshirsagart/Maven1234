package encapsulation;

public class SimpleMethod {
          private int a=20;
          private int b=10;
          private int c;
          private int d;
          
          
	
	public int getA() {
			return a;
		}



		public void setA(int a) {
			this.a = a;
		}



		public int getB() {
			return b;
		}



		public void setB(int b) {
			this.b = b;
		}



		public int getC() {
			return c;
		}



		public void setC(int c) {
			this.c = c;
		}



		public int getD() {
			return d;
		}



		public void setD(int d) {
			this.d = d;
		}



	public static void main(String[] args) {
              SimpleMethod obj=new SimpleMethod();
              obj.setC(112);
              obj.setD(350);
              System.out.println(obj.getA());
              System.out.println(obj.getB());
              System.out.println(obj.getC());
              System.out.println(obj.getD());

	}

}
