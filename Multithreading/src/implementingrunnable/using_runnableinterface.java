package implementingrunnable;

class Runnableinterface implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<2;i++)
		{
			System.out.println("using runnable interface....");
			
		}
		
	}
	
}

public class using_runnableinterface {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("thread in main method...");
			
		}
		
		Runnableinterface th=new Runnableinterface();
		
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		Thread t3=new Thread(th);
		
		t1.start();
		t2.start();
		t3.start();


		
	}

}
