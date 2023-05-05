package implementingrunnable;

public class ThreadsMethod extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Child Thread");
	}
	public static void main(String[] args) {
		ThreadsMethod tm=new ThreadsMethod();
		
		tm.setName("My Thread");
		
		/*tm.start();
		System.out.println(Thread.currentThread().getName());*/
		

	}

}
