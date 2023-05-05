package multi;

public class createthread extends Thread {
	
	public void run()
	// job of thread..
	{
		int num=8;
		for(int i=0;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);  
		}
	}

	public static void main(String[] args) {
		
		createthread c=new createthread();    // instantiated the thread....
		c.start();							// start execution of the thread...
									   //  when we call the run() method it treated as normal function not treated as a thread...	
		
		int num=9;
		for(int i=0;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i); 
		}
	}
}
