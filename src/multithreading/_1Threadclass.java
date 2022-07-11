package multithreading;

class A extends Thread{
	
	@Override
     public	void run() {    // chield thread
		try {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello tushar");   
			Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			
		}
	}
}
public class _1Threadclass {

	public static void main(String[] args)  throws Exception{  //main thread
		
		A t=new A();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello ranjit");   //main thread
			Thread.sleep(1000);
		}
		

	}

}
