package capgemini.thread;

public class ExtendedThread extends Thread {
	public ExtendedThread(String threadName) {
		super(threadName);
	}

	@Override
	public void run() {
		for (int num = 0; num < 10; num++) {
			System.out.println("\t" + getName() + ":->" + num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {

		System.out.println("ExtendedThread-> started...");
		Thread extendedThread = new ExtendedThread("ExtendedThread");
		extendedThread.start();
		System.out.println("ExtendedThread-> ended...");

	}

}

class ExtendThread extends Thread {
	@Override
	public void run() {
		System.out.println("ExtendThread is running.........");
	}
}
