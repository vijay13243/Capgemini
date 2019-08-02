package capgemini.thread;

public class JoiningThread {
	public static void main(String[] args) {
		System.out.println("JoiningThread-> Started.....");
		Thread T1 = new ExtendedThread("F1");
		Thread T2 = new ExtendedThread("F2");
		System.out.println("F1 has Started....");
		T1.start();
		try {
			System.out.println("T1 join......");
			T1.join();
			System.out.println("T1 is done....");
		} catch (InterruptedException e) {
			System.out.println(T1.getName() + " Interrupted....");
		}
		System.out.println("F2 has Started...........");
		T2.start();
		try {
			System.out.println("T2 join..");
			T2.join();
			System.out.println("T2 is done");
		} catch (InterruptedException e) {
			System.out.println(T2.getName() + "Interrupted");
		}
		for (int num = 0; num < 10; num++) {
			System.out.println(Thread.currentThread().getName() + ":->" + num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
