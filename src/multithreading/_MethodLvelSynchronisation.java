package multithreading;

class AAA extends Thread{
	
	
	@Override
	public synchronized void run() {
	
			for(int i=1;i<=3;i++) {
				System.out.println(Thread.currentThread().getName());
			
			}		
	}
	
}
public class _MethodLvelSynchronisation {

	public static void main(String[] args) throws Exception {
		AAA t1=new AAA();
		AAA t2=new AAA();
		AAA t3=new AAA();
		
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3" );
		
		t1.start();
	
		t2.start();
		t3.start();

	}

}