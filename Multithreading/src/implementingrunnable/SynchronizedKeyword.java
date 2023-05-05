package implementingrunnable;

class Team
{
	String playername;
	synchronized void  Wishing(String playername)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Good luck "+ playername);
		}
	}
}

class Game extends Thread
{
	Team t;
	String playername;
	
	public Game(Team t,String playername)
	{
		this.t=t;
		this.playername=playername;
		
	}
	
	public void run()
	{
		t.Wishing(this.playername);
	}
	
}

public class SynchronizedKeyword {

	public static void main(String[] args) {
		
		Team t1=new Team();
		
		Game g1 = new Game(t1, "Rohit Sharma");
		Game g2 = new Game(t1, "Virat Kohli");
		Game g3 = new Game(t1, "Suryakumar Yadav");
		Game g4 = new Game(t1, "Shikhar Dhawan");
		
		g1.start();
		g2.start();
		g3.start();
		g4.start();


	}

}
