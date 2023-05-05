package Assignments;

import java.util.Scanner;

class User
{
	String s;
	String user1;
	String user2;
	String user3;

	void userinput(String s, String user1, String user2, String user3) 
	{
		this.s = s;
		this.user1 = user1;
		this.user2 = user2;
		this.user3 = user3;
	}
}

class Red extends Thread 
{
	String s;
	User us;

	public Red(String s, User us) 
	{
		this.s = s;
		this.us = us;
	}

	public void run()
	{
		if (this.s.equals("Red"))
		{
			System.out.println("Stop");

		}

	}

}

class Green extends Thread
{
	String s;
	User us;

	public Green(String s, User us)
	{
		this.s = s;
		this.us = us;
	}

	public void run()
	{
		if (this.s.equals("Green")) 
		{
			System.out.println("Go");
		}
	}

}

class Yellow extends Thread 
{
	String s;
	User us;

	public Yellow(String s, User us)
	{
		this.s = s;
		this.us = us;
	}

	public void run()
	{
		if (this.s.equals("Yellow"))
		{
			System.out.println("Wait and Go");
		}
	}
}

public class Signal_lights {

	public static void main(String[] args) {
		User u = new User();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first colour ");
		String user1 = sc.next();
		Red r = new Red(user1, u);
		r.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter the second colour ");
		String user2 = sc.next();
		Green g = new Green(user2, u);
		g.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter the third colour ");
		String user3 = sc.next();
		Yellow y = new Yellow(user3, u);
		y.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
