package Assignments;

class Square extends Thread
{
	int a;
	
	public Square(int a)
	{
		this.a=a;
	}
	
	public void run()
	{
		int square=a*a;
		System.out.println("the square of the a is "+square);
	}
}

class Cube extends Thread
{
	int b;
	
	public Cube(int b)
	{
		this.b=b;
	}
	
	public void run()
	{
		int cube=b*b*b;
		System.out.println("the value of cube is "+cube);
	}
}

public class Assign1 {

	public static void main(String[] args) {


		
		
	}

}
