package capgemini.thread;

public class Multiple_Thread {
	public static void main(String[] args) {
		System.out.println("Multiple_Thread started.....");
		// anonymous class implementation....
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable is Running...........");
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		// anonynous class implementation for Thread class
		Thread thread2 = new Thread() {

			@Override
			public void run() {
				System.out.println("Thread is running.........");
			}
		};
		thread2.start();
		System.out.println("Multiple_Thread ended.....");
	}
}
