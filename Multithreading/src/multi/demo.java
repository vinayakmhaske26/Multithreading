package multi;

public class demo extends Thread{
	
	public void run()
	// job of thread..
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {

		demo d=new demo();   // instantiated the thread....
		d.start();			// start execution of the thread...
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main thread");
		}
		
		// vector are used as a thread safe....
		
	}

}
