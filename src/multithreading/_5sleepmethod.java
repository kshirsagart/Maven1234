package multithreading;

class ACD extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			
		}
		
	}
	
}
public class _5sleepmethod {

	public static void main(String[] args) {
		ACD t1=new ACD();
		ACD t2=new ACD();
		ACD t3=new ACD();
		
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3" );
		
		t1.start();
	
		t2.start();
		t3.start();

	}

}
