package implementingrunnable;

public class Using_threadclass {

	public static void main(String[] args) {


		Thread th=new Thread("ABC");
		
		th.start();
		
		String str=th.getName();
		System.out.println(str); 
	}

}
