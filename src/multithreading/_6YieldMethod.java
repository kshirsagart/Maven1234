package multithreading;

class cheilds extends Thread{
	
	@Override 
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}
public class _6YieldMethod {
	

	public static void main(String[] args) {
		
		cheilds t1=new cheilds();
		cheilds t2=new cheilds();
		cheilds t3=new cheilds();
		
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3");
		
		t1.start();
	
		t2.start();
	    Thread.yield();
		t3.start();
		
		
		

	}

}
