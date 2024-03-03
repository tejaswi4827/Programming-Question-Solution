
public class MyThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new MyThread()).start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

}
