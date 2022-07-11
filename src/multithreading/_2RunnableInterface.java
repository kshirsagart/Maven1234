package multithreading;

class B implements Runnable{
	
	public void run() {
		     try {
		    	 
		     
		for(int i=1;i<=5;i++) {
			System.out.println("My chield thread");
			Thread.sleep(1000);
		}
		}catch(Exception e) {
			
		}
		}
	}

public class _2RunnableInterface  {

	public static void main(String[] args)throws Exception {
		B r=new B();
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("My main thread");
			Thread.sleep(1000);
		}

	}

}
