package multithreading;

class ABC extends Thread{
          
	@Override
	public void run() {
		
		
		for(int i=1;i<=3;i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class _4joinmethod {

	public static void main(String[] args) throws Exception {
		
		ABC t1=new ABC();
		ABC t2=new ABC();
		ABC t3=new ABC();
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t2.start();
		t2.join();
		t1.start();
		t3.start();
		

	}

}
