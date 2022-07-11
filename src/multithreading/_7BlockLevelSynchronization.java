package multithreading;

class Parent extends Thread{
	
	@Override
	public void run() {
		           synchronized(this) {
					for(int i=1;i<=3;i++) {
				System.out.println(Thread.currentThread().getName());
				
					}
		}
	}
	
}
public class _7BlockLevelSynchronization {

	public static void main(String[] args) {
		Parent t1=new Parent();
		Parent t2=new Parent();
		Parent t3=new Parent();

	    t1.setName("thread1");
	    t2.setName("thread2");
	    t3.setName("thread3");
	    
	    t1.start();
	    t2.start();
	    t3.start();
		
		
		
		

	}

}
