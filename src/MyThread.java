
public class MyThread extends Thread {
	private int value;
	
	public MyThread(int value) {
		this.value = value;
	}
	
	public void run() {
		for(int i = 0; i < value; i++) {
			System.out.println("Thread" + Thread.currentThread().getId() + " counting: " + i);
		}
	}
}
