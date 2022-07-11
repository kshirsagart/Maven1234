package multithreading;

class AA extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
	}
}


public class _3ThreadPriority {

	public static void main(String[] args) {
		AA t1=new AA();
		AA t2=new AA();
		AA t3=new AA();
		
	    t1.setName("t1 thread");
		t2.setName("t2 thread");
		t3.setName("t3 thread");  
		
		t1.setPriority(2);
		t2.setPriority(8);
		t3.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
