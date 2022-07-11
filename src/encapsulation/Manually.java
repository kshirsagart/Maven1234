package encapsulation;

public class Manually {
       private int A=20;
       private int B=30;
       private int C;
       private int D;
       
       public int getA() {
    	   return A;
       }
       public void setA(int A) {
    	   this.A=A;
       }
       public int getB() {
    	   return B;
       }
       public void setB(int B) {
    	   this.B=B;
       }
       public int getC() {
    	   return C;
       }
       public void setC(int C) {
    	   this.C=C;
       }
       public int getD() {
    	   return D;
       }
       public void setD(int D) {
    	   this.D=D;
       }

	
	public static void main(String[] args) {
		Manually obj=new Manually();
		obj.setC(350);
		obj.setD(250);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		System.out.println(obj.getD());
	
		

	}

}
