package Assignments;

import java.util.Random;

class First_thread extends Thread
{
	
	Random random=new Random();
	int a;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			a=random.nextInt(100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			if(a%2==0)
			{
				Second_thread st=new Second_thread(a);
				st.start();
			}
			
			else
			{
				Third_thread tt=new Third_thread(a);
				tt.start();
			}
		}
		
	}
	
}

class Second_thread extends Thread
{
	int a;
	First_thread ft;
	
	public Second_thread(int a)
	{
		this.a=a;
		this.ft=ft;
	}
	
	public void run()
	{
		System.out.println(a+" the square of number is "+ a * a);
	}
	
}
class Third_thread extends Thread
{
	int a;
	First_thread ft;
	
	public Third_thread(int a)
	{
		this.a=a;
		this.ft=ft;
		
	}
	
	public void run()
	{
		System.out.println(a+" the cube of number is  "+ a * a * a);
	}
}
 
public class Multithread_Application {

	public static void main(String[] args) {


		First_thread ft=new First_thread();
		
		ft.start();
	}

}
