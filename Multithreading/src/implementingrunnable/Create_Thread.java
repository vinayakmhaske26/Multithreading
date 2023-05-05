package implementingrunnable;

// create thread and use that sleep method
// sleep method are stop working of thread for a specific amount of time. and then execute the next weighting thread...

public class Create_Thread extends Thread {

	public void run() 
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("the method is executing....");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("the method is depend on JVM....");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Create_Thread th = new Create_Thread();

		th.start();

	}

}
