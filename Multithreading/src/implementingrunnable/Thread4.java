package implementingrunnable;

public class Thread4  implements Runnable{

	public static void main(String[] args) {

		Thread4 th=new Thread4();
		Thread t1=new Thread();
		Thread t2=new Thread(th);
		
		//t1.start();  //this calls Thread's start() 
		
		//t2.start();   //this calls Thread's start() and from that it calls run method of Thread4
		
		//th.start();    start() is not member of Thread4
		
	//	t1.run();   // this calls Thread's run() and method will be treated like simple function
		
	//	t2.run();    //this calls Thread4's run() and method will be treated like simple function
		
		th.run();    //this calls Thread4's run() and method will be treated like simple function
	
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Child Thread");
		}
		
	}

}
