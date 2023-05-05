package implementingrunnable;

public class demo1 implements Runnable {

	public static void main(String[] args) {

		demo1 d1 = new demo1();

		
		Thread th = new Thread(d1); 

		th.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println(3 * i);
		}

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
		}

	}

}
