package implementingrunnable;

public class ThreadClassConstructor implements Runnable {

	public static void main(String[] args) {
		
		ThreadClassConstructor th=new ThreadClassConstructor();
		
		/*Thread t1=new Thread();
		
		System.out.println(t1.getName());
		t1.setName("October Java");
		System.out.println(t1.getName());
		Thread t2=new Thread(th);
		
		Thread t3=new Thread("ITP");
		System.out.println(t3.getName());
		Thread t4=new Thread(th, "Java");
		System.out.println(t4.getName());*/
		
		ThreadGroup tg=new ThreadGroup("Core Java");
		ThreadGroup tg1=new ThreadGroup("Adv Java");
		Thread t5=new Thread(tg,th);
		Thread t6=new Thread(tg,th);
		Thread t7=new Thread(tg1, th, "ABC");
		Thread t8=new Thread(tg1, th, "PQR", 678);
		Thread t9=new Thread(tg1, t8, "LMN", 0, false);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
